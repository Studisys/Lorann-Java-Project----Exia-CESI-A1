package MonModele;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Item {
	
	protected int x, y;
	protected Icon image;
	protected String name;
	
	public void setImage(String image)
	{
		this.image = new ImageIcon(image);
	}
	
	
	public Icon getImage()
	{
		return this.image;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
