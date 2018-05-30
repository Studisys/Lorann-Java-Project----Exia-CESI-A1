package maVue;

import java.awt.Graphics;
import java.awt.image.ImageObserver;


public interface iGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics,ImageObserver observer);

	public int getGlobalWidth();

	public int getGlobalHeight();

}
