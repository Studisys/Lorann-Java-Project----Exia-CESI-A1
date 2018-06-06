package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class MONSTER_TotemMan</h1>
 * * Class for the "Totem" demon
 * Is an ennemy : collider = 2.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */
public class MONSTER_TotemMan extends MOVABLEITEM_Ennemy {

	/** The image. */
	//IMAGE = "/images/monster_3";
	private String image = "monster_3.png";
	
	/** The collider. */
	private int collider = 2;
	
	/**
	 * Instantiates a new MONSTE R totem man.
	 */
	public MONSTER_TotemMan() 
	{
		this.setName("TotemMan");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
