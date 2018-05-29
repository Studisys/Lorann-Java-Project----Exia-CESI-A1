package MonModele;

import java.awt.Point;

public abstract class Movable implements iMobile {

	
	private int speed;
	private Position position;
	
	public Movable()
	{
		
	}
	
	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setImage(String image)
	{
		
	}
	
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosition(Point position) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	private void moveUp()
	{
		
	}

	private void moveDown()
	{
		
	}
	
	private void moveLeft()
	{
		
	}
	
	private void moveRight()
	{
		
	}
	
	
	public void placeInMap(Position position)
	{
		
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}
}
