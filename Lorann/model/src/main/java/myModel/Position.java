package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class Position</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */
public class Position {

	/** The max Y. */
	private int x, y, maxX,maxY;
	
	
	/**
	 * Instantiates a new position.
	 *
	 * @param x the x
	 * @param y the y
	 * @param maxX the max X
	 * @param maxY the max Y
	 */
	public Position(int x, int y, int maxX, int maxY)
	{
		this.setMaxX(maxX);
		this.setX(x);
		this.setY(y);
		this.setMaxY(maxY);
	}
	
	/**
	 * Instantiates a new position.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Position(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * Instantiates a new position.
	 *
	 * @param position the position
	 */
	public Position (Position position)
	{
		this.setX(this.getX());
		this.setY(this.getY());
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Gets the max X.
	 *
	 * @return the max X
	 */
	public int getMaxX() {
		return maxX;
	}

	/**
	 * Sets the max X.
	 *
	 * @param maxX the new max X
	 */
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	/**
	 * Gets the max Y.
	 *
	 * @return the max Y
	 */
	public int getMaxY() {
		return maxY;
	}

	/**
	 * Sets the max Y.
	 *
	 * @param maxY the new max Y
	 */
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	
	
}
