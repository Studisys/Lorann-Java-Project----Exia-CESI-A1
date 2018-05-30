package MonModele;
/**********************************************************************************
**																				 **
**							  	  Class Pillar									 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class WALL_Pillar extends WALL_Wall {
	
	//IMAGE bone
	private String image = "C:/Users/Nicolas Drapier/git/Lorann-Java-Project----Exia-CESI-A1/Lorann/model/images/bone.png";
	
	public WALL_Pillar()
	{

		this.setName("pillar");
		this.setImage(image);
	}
}
