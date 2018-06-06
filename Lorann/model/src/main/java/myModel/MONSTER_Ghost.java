package myModel;
/**
 * <h1>The Class MONSTER_Ghost</h1>
 * Class for the "Ghost" demon
 * Is an ennemy : collider = 2
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */
public class MONSTER_Ghost extends MOVABLEITEM_Ennemy {

	//	IMAGE = "/images/monster_1";
	private String image = "monster_1.png";
	private int collider = 2; // It's an ennemy
	
	public MONSTER_Ghost() 
	{
		this.setName("Ghost");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
