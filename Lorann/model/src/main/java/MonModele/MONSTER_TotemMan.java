package MonModele;

/**********************************************************************************
**																				 **
**							  	   MONSTER 3								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
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
