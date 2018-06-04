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
	private String image = "../model/images/monster_2.png";	
	public MONSTER_Skull() 
	{
		this.setName("Skull");
		this.setImage(image);
	}
	
}
