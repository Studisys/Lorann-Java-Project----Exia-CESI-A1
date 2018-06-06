package myView;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Interface iGraphicsBuilder</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */


public interface iGraphicsBuilder {
	
	/**
	 * Apply model to graphic.
	 *
	 * @param graphics the graphics
	 * @param observer the observer
	 */
	public void applyModelToGraphic(Graphics graphics,ImageObserver observer);

	/**
	 * Gets the global width.
	 *
	 * @return the global width
	 */
	public int getGlobalWidth();

	/**
	 * Gets the global height.
	 *
	 * @return the global height
	 */
	public int getGlobalHeight();

}
