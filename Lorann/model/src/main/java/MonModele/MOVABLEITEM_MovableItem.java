package MonModele;
import javax.swing.ImageIcon;

public abstract class MOVABLEITEM_MovableItem extends Item implements INTERFACE_Mobile {

	
	@SuppressWarnings("unused")
	private int speed;
	@SuppressWarnings("unused")
	private Position position;
	@SuppressWarnings("unused")
	private ImageIcon img;
	@SuppressWarnings("unused")
	private String chemin;
	

	public MOVABLEITEM_MovableItem()
	{
		
	}
	

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@SuppressWarnings("unused")
	private void moveUp(String image)
	{
		this.setImage(image);
	}

	@SuppressWarnings("unused")
	private void moveDown(String image)
	{
		this.setImage(image);
	}
	
	@SuppressWarnings("unused")
	private void moveLeft(String image)
	{
		this.setImage(image);
	}
	
	@SuppressWarnings("unused")
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
