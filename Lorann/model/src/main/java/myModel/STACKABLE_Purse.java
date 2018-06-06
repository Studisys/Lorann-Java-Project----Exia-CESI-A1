package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class STACKABLE_Purse</h1>
 * * Class for the stackable (grab) item "Purse"
 * Is  possible to grab : collider = 4.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see STACKABLE_StackableItem
 */
public class STACKABLE_Purse extends STACKABLE_StackableItem {
	
	/** The image. */
	private String image = "purse.png";
	
	/** The collider. */
	private int collider = 4; //STACKABLE
	
	/**
	 * Instantiates a new STACKABL E purse.
	 */
	public STACKABLE_Purse( )
	{
		this.setName("purse");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
