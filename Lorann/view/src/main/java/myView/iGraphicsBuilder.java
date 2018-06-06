package myView;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 * <h1>The Interface iGraphicsBuilder</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */


public interface iGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics,ImageObserver observer);

	public int getGlobalWidth();

	public int getGlobalHeight();

}
