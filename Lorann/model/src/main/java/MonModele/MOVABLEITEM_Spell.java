package MonModele;
/**
 * <h1>The Class MOVABLEITEM_Spell</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_MovableItem
 */
public class MOVABLEITEM_Spell extends MOVABLEITEM_MovableItem {

	
	private int speed = 20;
	@SuppressWarnings("unused")
	private int maxDistanceTraveled;
	@SuppressWarnings("unused")
	private int distanceTraveled;
	private String image;

	public MOVABLEITEM_Spell(Direction direction)
	{
		
	}
	public MOVABLEITEM_Spell(Direction direction, Position position)
	{
		
	}
	
	public MOVABLEITEM_Spell()
	{
	}
	
	public int getWidthWithADirection(Direction direction)
	{
		switch (direction) {
		case UP:
		case DOWN:
			return 48;
		case RIGHT:
		case LEFT:
		default:
			return 48;
	}
	}
	
	public int getHeightWithADirection(Direction direction)
	{
		switch (direction) 
		{
		case UP:
		case DOWN:
			return 48;
		case RIGHT:
		case LEFT:
		default:
			return 48;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void launch()
	{

	}
}
