package maVue;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import MonModele.INTERFACE_Model;
import MonModele.Item;

public class GraphicsBuilder implements iGraphicsBuilder{
	
	private final INTERFACE_Model lorannModel;
	int imageWidth= 48;
	int imageHeight = 48;
	
	private Item[][] map;
	private ArrayList<Item> monsterList;
	
	public GraphicsBuilder(INTERFACE_Model lorannModel)
	{
		this.lorannModel = lorannModel;
		this.map = this.lorannModel.getItemList();
		this.monsterList = this.lorannModel.getMonsterList();
	}
	
	/*private void drawMobile(Graphics g, ImageObserver observer)
	{
		
	}*/
	
	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) 
	{
		Item item;
		for (int y = 0; y<=11; y++)
		{
			for (int x = 0; x<=19; x++)
			{
				item = this.map[y][x];
				graphics.drawImage(item.getImage(), 48*x, 48*y, 48, 48, null);
			}
		}	
		
		for (Item items : this.monsterList) 
		{
			graphics.drawImage(items.getImage(), 
					items.getPosition().getX()*48, 
					items.getPosition().getY() *48, 
					48, 48, null);
		}	
		
		graphics.drawImage(this.lorannModel.getLorann().getImage(), 
				48*this.lorannModel.getLorann().getPosition().getX(), 
				48*this.lorannModel.getLorann().getPosition().getY(), 
				48, 
				48, 
				null);
		
	}
	@Override
	public int getGlobalWidth() 
	{
		return this.imageWidth * 20;
	}
	@Override
	public int getGlobalHeight() 
	{
		return this.imageHeight * 12;
	}

}
