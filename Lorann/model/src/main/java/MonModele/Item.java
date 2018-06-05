package MonModele;

/**
 * <h1>The Abstract Class Item</h1>
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 */

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Item {
	
	protected int x, y;
	protected ImageIcon source;
	protected Image monImage;
	protected String name;
	protected Position position;
	protected int colliderPermission;
	
	protected ArrayList<Image> myImages;
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setImage(String image)
	{
		try
		{
			this.monImage = ImageIO.read(new File("../model/images/" + image));
					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public Image getImage()
	{
		return this.monImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColliderPermission() {
		return colliderPermission;
	}

	public void setColliderPermission(int colliderPermission) {
		this.colliderPermission = colliderPermission;
	}
	

}
