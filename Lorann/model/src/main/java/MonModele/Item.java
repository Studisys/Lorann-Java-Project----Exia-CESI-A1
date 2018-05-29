package MonModele;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Item {
	
	protected int x, y;
	protected ImageIcon image;
	
	public void setImage(String image)
	{
		this.image = new ImageIcon(getClass().getResource(image));
	}
}
