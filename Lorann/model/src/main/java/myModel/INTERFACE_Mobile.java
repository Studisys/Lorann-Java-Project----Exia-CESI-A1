package myModel;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Interface INTERFACE_Mobile</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */

public interface INTERFACE_Mobile {

	
	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection();
	
	/**
	 * Sets the direction.
	 *
	 * @param direction the new direction
	 */
	public void setDirection(Direction direction);
	
	/**
	 * Move.
	 *
	 * @return true, if successful
	 */
	public boolean move();
	
	
	
}
