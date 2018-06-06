package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class MONSTER_Ghost</h1>
 * Class for the "Ghost" demon
 * Is an ennemy : collider = 2.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */
public class MONSTER_Ghost extends MOVABLEITEM_Ennemy {

	/** The image. */
	//	IMAGE = "/images/monster_1";
	private String image = "monster_1.png";
	
	/** The collider. */
	private int collider = 2; // It's an ennemy
	
	/**
	 * Instantiates a new MONSTE R ghost.
	 */
	public MONSTER_Ghost() 
	{
		this.setName("Ghost");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
