package MonModele;

import java.awt.Point;

import javax.swing.ImageIcon;

public interface INTERFACE_Mobile {

	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public boolean move();
	public Point getPosition();
	public void setPosition(Point position);
	
	
	
}
