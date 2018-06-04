package maVue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import MonModele.INTERFACE_Mobile;
import MonModele.INTERFACE_Model;
import MonModele.Item;

public class GraphicsBuilder implements iGraphicsBuilder{
	
	private final INTERFACE_Model lorannModel;
	private String level = "AJJJJJJJJJJJJJJJJJJAXYYYUYYYYYYYYYYYYYYXXYYAJJJAYAJJJJJJAAYXXYAYYYYYYYYYYYYYXYYXXYXYAJJJJJJJJAYYXYHXXYXYXYYYYKYYYXYYXYAAXYXYXYYYYYYYYXYAASAAXYXYAJJJAYAJJAYYXYYXXYAYYYYYYYYYYYYBAYYXXYYAJJJJJJJJJJJJAAYXXYTYYYYYYYYYYYYYYYYXAJJJJJJJJJJJJJJJJAJA";
	int imageWidth= 48;
	int imageHeight = 48;
	
	private Image gate;
	private Image wallH;
	private Image wallY;
	private Image pillar;
	private Image superball;
	private Image m1;
	private Image m2;
	private Image m3;
	private Image m4;
	private Image lorann;
	private Image purse;
	private Image vide;
	
	public GraphicsBuilder(INTERFACE_Model lorannModel)
	{
		this.lorannModel = lorannModel;

	}
	private void drawMobile(Graphics g, ImageObserver observer)
	{
		
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

		for (final mobile : this.lorannModel.getMobiles()) {
			this.drawMobile(mobile.getImage(), graphics, observer);
		}
	}
	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
