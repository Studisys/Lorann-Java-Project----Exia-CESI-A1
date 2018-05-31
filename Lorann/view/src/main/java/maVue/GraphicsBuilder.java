package maVue;

import java.awt.Graphics;
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
	public GraphicsBuilder(INTERFACE_Model lorannModel)
	{
		this.lorannModel = lorannModel;
		this.lorannModel.buildMap(level);
	}
	private void drawMobile(Item mobile,Graphics graphics, ImageObserver observer)
	{
		final BufferedImage imageMobile = new BufferedImage(imageWidth, imageHeight, Transparency.TRANSLUCENT);
		final Graphics graphicsMobile = imageMobile.getGraphics();

		graphicsMobile.drawImage(mobile.getImage(), 0, 0, imageWidth, imageHeight, observer);
		graphics.drawImage(imageMobile, mobile.getPosition().getX(), mobile.getPosition().getY(), observer);
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

