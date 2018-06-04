package maVue;

import java.awt.Graphics;
import java.awt.image.ImageObserver;


public interface iGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics,ImageObserver observer, String level);

	public int getGlobalWidth();

	public int getGlobalHeight();

}
