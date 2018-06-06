package myModel;
/**
 * <h1>The Class WALL_Wall</h1>
 * * * Class for the walls that are blocking
 * Is blocking : collider = 0
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see Item
 */
public abstract class WALL_Wall extends Item {
	private int collider = 0; //COLLISION
	
	public WALL_Wall()
	{
		this.setColliderPermission(this.collider);
	}

}
