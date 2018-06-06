package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class MOVABLEITEM_Spell</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_MovableItem
 */
public class MOVABLEITEM_Spell extends MOVABLEITEM_MovableItem {

	
	/** The speed. */
	private int speed = 20;
	
	/** The max distance traveled. */
	@SuppressWarnings("unused")
	private int maxDistanceTraveled;
	
	/** The distance traveled. */
	@SuppressWarnings("unused")
	private int distanceTraveled;

	/**
	 * Instantiates a new MOVABLEITE M spell.
	 *
	 * @param direction the direction
	 */
	public MOVABLEITEM_Spell(Direction direction)
	{
		
	}
	
	/**
	 * Instantiates a new MOVABLEITE M spell.
	 *
	 * @param direction the direction
	 * @param position the position
	 */
	public MOVABLEITEM_Spell(Direction direction, Position position)
	{
		
	}
	
	/**
	 * Instantiates a new MOVABLEITE M spell.
	 */
	public MOVABLEITEM_Spell()
	{
	}
	
	/**
	 * Gets the width with A direction.
	 *
	 * @param direction the direction
	 * @return the width with A direction
	 */
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
	
	/**
	 * Gets the height with A direction.
	 *
	 * @param direction the direction
	 * @return the height with A direction
	 */
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
	
	/**
	 * Gets the speed.
	 *
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Sets the speed.
	 *
	 * @param speed the new speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * Launch.
	 */
	public void launch()
	{

	}
}
