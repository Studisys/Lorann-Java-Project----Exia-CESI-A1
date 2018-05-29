package MonModele;

import java.awt.Point;

import javax.swing.ImageIcon;

public interface iMobile {

	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public ImageIcon getImage();
	public void setImage(String image);
	public boolean move();
	public Point getPosition();
	public void setPosition(Point position);
	
	
	
}
