package MonModele;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class Panel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
		
	private Item[][] map;
	private ArrayList<Item> monsters;
	
	public Panel(Item map[][], ArrayList<Item> monster)
	{
		this.map = map;
		this.monsters = monster;
	}
	
	public void paintComponent(Graphics g)
	{
		Item item;
			for (int y = 0; y<=11; y++)
			{
				for (int x = 0; x<=19; x++)
				{
					item = this.map[y][x];
					g.drawImage(item.getImage(), 48*x+50, 48*y+50, 48, 48, this);
				}
			}	
			
			for (Item items : this.monsters) 
			{
				g.drawImage(items.getImage(), items.getPosition().getX()*48+50, items.getPosition().getY() *48+50, 48, 48, this);
			}		
	}

	public void clear(Graphics g)
	{
		g.fillRect(0, 0, new Map().getWidth(), new Map().getHeight());
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.repaint();
	}
	
}
