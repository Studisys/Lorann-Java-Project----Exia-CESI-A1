package MonModele;
/**
 * <h1>The Class WALL_Wall</h1>
 *
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
