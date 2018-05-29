package MonModele;

import java.awt.Point;

public interface iMobile {

	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public String getImage();
	public void setImage(String image);
	public void move();
	public Point getPosition();
	public void setPosition(Point position);
	
	
	
}
