package MonModele;
/**
 * <h1>The Class Position</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */
public class Position {

	private int x, y, maxX,maxY;
	
	
	public Position(int x, int y, int maxX, int maxY)
	{
		this.setMaxX(maxX);
		this.setX(x);
		this.setY(y);
		this.setMaxY(maxY);
	}
	
	public Position(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public Position (Position position)
	{
		this.setX(this.getX());
		this.setY(this.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	
	
}
