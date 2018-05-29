package MonModele;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Movable implements iMobile {

	
	private int speed;
	private Position position;
	private ImageIcon img;
	private String chemin;
	
	public Movable()
	{
		
	}
	
	@Override
	public ImageIcon getImage() {
		// TODO Auto-generated method stub
		return this.img;
	}
	@Override
	public void setImage(String image)
	{
		this.img = new ImageIcon(getClass().getResource(image));
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
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
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
