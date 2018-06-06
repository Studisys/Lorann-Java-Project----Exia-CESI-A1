package myModel;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class MONSTER_StormTrooper</h1>
 * Class for the "Stormtrooper" demon
 * Is an ennemy : collider = 2.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */

public class MONSTER_StormTrooper extends MOVABLEITEM_Ennemy {

/** The image. */
//	IMAGE = "/images/monster_4";
	private String image = "monster_4.png";	
	
	/** The collider. */
	private int collider = 2;
	
	/**
	 * Instantiates a new MONSTE R storm trooper.
	 */
	public MONSTER_StormTrooper() 
	{
		this.setName("StormTrooper");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
