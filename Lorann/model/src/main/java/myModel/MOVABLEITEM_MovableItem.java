package myModel;

// TODO: Auto-generated Javadoc
/**
 *  The MOVABLEITEM_MovableItem Class.
 *
 * @author Nicolas DRAPIER
 */
public class MOVABLEITEM_MovableItem extends Item implements INTERFACE_Mobile {

	

	/**
	 * Instantiates a new MOVABLEITE M movable item.
	 */
	public MOVABLEITEM_MovableItem()
	{
		
	}
	

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Mobile#move()
	 */
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	/**
	 * Place in map.
	 *
	 * @param position the position
	 */
	public void placeInMap(Position position)
	{
		
	}

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Mobile#getDirection()
	 */
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Mobile#setDirection(myModel.Direction)
	 */
	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Gets the x with direction.
	 *
	 * @param x the x
	 * @param direction the direction
	 * @return the x with direction
	 */
	public int getXWithDirection(int x, Direction direction)
	{
		switch (direction)
		{
		case UP: return 0;

		case DOWN:
			break;
			default: return 0;
		}
		return 0;
	}
	
}
