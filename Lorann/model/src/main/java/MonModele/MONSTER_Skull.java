package MonModele;
/**********************************************************************************
**																				 **
**							  		MONSTER 2								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
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
