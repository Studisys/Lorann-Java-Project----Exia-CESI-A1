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

public abstract class Item {
	
	protected int x, y;
	protected ImageIcon source;
	protected Image myImage;
	protected String name;
	protected Position position;
	protected int colliderPermission;
	
	protected ArrayList<Image> myImages;
	
	/** Get position of an Item */
	public Position getPosition() {
		return position;
	}

	/** Set position of an Item */
	public void setPosition(Position position) {
		this.position = position;
	}

	/** Change image of an item */
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
	
	/** Get the image */
	public Image getImage()
	{
		return this.myImage;
	}

	/** Get the name */
	public String getName() {
		return name;
	}

	/** Set the name */
	public void setName(String name) {
		this.name = name;
	}

	/** get the collider ID of an item */
	public int getColliderPermission() {
		return colliderPermission;
	}

	/** Set the collider ID for the item */
	public void setColliderPermission(int colliderPermission) {
		this.colliderPermission = colliderPermission;
	}
	

}
