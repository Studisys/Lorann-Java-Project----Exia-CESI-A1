package MonModele;

/**********************************************************************************
**																				 **
**																				 **
**									Class Item									 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright									 **
**																				 **
**********************************************************************************/

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Item {
	
	protected int x, y;
	protected Icon image;
	protected ImageIcon source;
	protected Image monImage;
	protected String name;
	protected Position position;
	
	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	public void setImage(String image)
	{
		/*this.source = new ImageIcon(image);
		this.image = new ImageIcon(this.source.getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT));*/
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

}
