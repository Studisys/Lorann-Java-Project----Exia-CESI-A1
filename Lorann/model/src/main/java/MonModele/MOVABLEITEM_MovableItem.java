package MonModele;

public class MOVABLEITEM_MovableItem extends Item implements INTERFACE_Mobile {

	

	public MOVABLEITEM_MovableItem()
	{
		
	}
	

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
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
