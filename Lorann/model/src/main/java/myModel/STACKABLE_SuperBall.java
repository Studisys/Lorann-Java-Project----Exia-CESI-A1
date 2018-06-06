package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class STACKABLE_SuperBall</h1>
 * * * Class for the stackable (grab) item "Crystal Ball"
 * Is  possible to grab : collider = 5.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see STACKABLE_StackableItem
 */
public class STACKABLE_SuperBall extends STACKABLE_StackableItem {
	
	/** The image. */
	private String image = "crystal_ball.png";
	
	/** The collider. */
	private int collider = 5;
	
	/**
	 * Instantiates a new STACKABL E super ball.
	 */
	public STACKABLE_SuperBall( )
	{
		this.setName("superball");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
