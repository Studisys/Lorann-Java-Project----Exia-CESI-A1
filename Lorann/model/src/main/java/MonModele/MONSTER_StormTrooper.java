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
	private String image = "../model/images/monster_4.png";	
	public MONSTER_StormTrooper() 
	{
		this.setName("StormTrooper");
		this.setImage(image);
	}

}
