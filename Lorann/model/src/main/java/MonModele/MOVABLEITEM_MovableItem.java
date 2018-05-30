package MonModele;
/**********************************************************************************
**																				 **
**						   General Class MovableItem							 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class MOVABLEITEM_MovableItem extends Item implements INTERFACE_Mobile {

	
	private int speed;
	private Position position;
	private ImageIcon img;
	private String chemin;
	
	public MOVABLEITEM_MovableItem()
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
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}
	

	private void moveUp(String image)
	{
		this.setImage(image);
	}

	private void moveDown(String image)
	{
		this.setImage(image);
	}
	
	private void moveLeft(String image)
	{
		this.setImage(image);
	}
	
	private void moveRight(String image)
	{
		this.setImage(image);
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
