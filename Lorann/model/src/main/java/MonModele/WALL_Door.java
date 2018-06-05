package MonModele;
/**
 * <h1>The Class WALL_Door</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see WALL_Wall
 */
public class WALL_Door extends WALL_Wall {

	//IMAGE gate-closed
	private String image = "gate_closed.png";
	private int collider = 2;
	
	public WALL_Door()
	{
		this.setName("door");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}
}
