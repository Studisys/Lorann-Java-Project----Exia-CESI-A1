package MonModele;
/**********************************************************************************
**																				 **
**							  		MONSTER 1								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class MONSTER_Ghost extends MOVABLEITEM_Ennemy {

	//	IMAGE = "/images/monster_1";
	private String image = "C:/Users/Nicolas Drapier/git/Lorann-Java-Project----Exia-CESI-A1/Lorann/model/images/monster_1.png";
	public MONSTER_Ghost() 
	{
		this.setName("Ghost");
		this.setImage(image);
	}

}
