package myModel;
/**
 * <h1>The Class MONSTER_Skull</h1>
  * Class for the "Skull" demon
 * Is an ennemy : collider = 2
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */
public class MONSTER_Skull extends MOVABLEITEM_Ennemy {

//	IMAGE = "/images/monster_2";
	private String image = "monster_2.png";	
	private int collider = 2;
	
	public MONSTER_Skull() 
	{
		this.setName("Skull");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}
	
}
