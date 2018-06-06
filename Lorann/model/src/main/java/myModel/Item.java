package myModel;

/**
 * <h1>The Abstract Class Item</h1>
 * Allows to set an image, a position, and collision Int (an identifier saying whether the item is blocking, ...)
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 */

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

// TODO: Auto-generated Javadoc
/**
 * The Class Item.
 */
public abstract class Item {
	
	/** The y. */
	protected int x, y;
	
	/** The source. */
	protected ImageIcon source;
	
	/** The my image. */
	protected Image myImage;
	
	/** The name. */
	protected String name;
	
	/** The position. */
	protected Position position;
	
	/** The collider permission. */
	protected int colliderPermission;
	
	/** The my images. */
	protected ArrayList<Image> myImages;
	
	/**
	 *  Get position of an Item.
	 *
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 *  Set position of an Item.
	 *
	 * @param position the new position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 *  Change image of an item.
	 *
	 * @param image the new image
	 */
	public void setImage(String image)
	{
		try
		{
			this.myImage = ImageIO.read(new File("../model/images/" + image));
					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	/**
	 *  Get the image.
	 *
	 * @return the image
	 */
	public Image getImage()
	{
		return this.myImage;
	}

	/**
	 *  Get the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 *  Set the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *  get the collider ID of an item.
	 *
	 * @return the collider permission
	 */
	public int getColliderPermission() {
		return colliderPermission;
	}

	/**
	 *  Set the collider ID for the item.
	 *
	 * @param colliderPermission the new collider permission
	 */
	public void setColliderPermission(int colliderPermission) {
		this.colliderPermission = colliderPermission;
	}
	

}
