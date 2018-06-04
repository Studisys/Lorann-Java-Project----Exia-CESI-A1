package MonModele;

/**********************************************************************************
**																				 **
**							  		MONSTER 4								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class MONSTER_StormTrooper extends MOVABLEITEM_Ennemy {

//	IMAGE = "/images/monster_4";
	private String image = "monster_4.png";	
	private int collider = 2;
	
	public MONSTER_StormTrooper() 
	{
		this.setName("StormTrooper");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
