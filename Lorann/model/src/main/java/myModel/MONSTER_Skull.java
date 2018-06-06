package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class MONSTER_Skull</h1>
 * Class for the "Skull" demon
 * Is an ennemy : collider = 2.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */
public class MONSTER_Skull extends MOVABLEITEM_Ennemy {

/** The image. */
//	IMAGE = "/images/monster_2";
	private String image = "monster_2.png";	
	
	/** The collider. */
	private int collider = 2;
	
	/**
	 * Instantiates a new MONSTE R skull.
	 */
	public MONSTER_Skull() 
	{
		this.setName("Skull");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}
	
}
