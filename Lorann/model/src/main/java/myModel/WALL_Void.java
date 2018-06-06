package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class WALL_Void</h1>
 * * * Class for an empty square (void)
 * Is empty, not blocking : collision = 3.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see WALL_Wall
 */
public class WALL_Void extends WALL_Wall {

	/** The image. */
	//IMAGE gate-closed
	private String image = "void.png";
	
	/** The collider. */
	private int collider = 3;
	
	/**
	 * Instantiates a new WAL L void.
	 */
	public WALL_Void()
	{
		this.setName("void");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}
}
