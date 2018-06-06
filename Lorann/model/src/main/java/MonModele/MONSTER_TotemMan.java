package MonModele;
/**
 * <h1>The Class MONSTER_TotemMan</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_Ennemy
 */
public class MONSTER_TotemMan extends MOVABLEITEM_Ennemy {

	//IMAGE = "/images/monster_3";
	private String image = "monster_3.png";
	private int collider = 2;
	
	public MONSTER_TotemMan() 
	{
		this.setName("TotemMan");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
