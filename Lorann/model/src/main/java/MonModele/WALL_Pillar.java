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
	private String image = "bone.png";
	
	public WALL_Pillar()
	{

		this.setName("pillar");
		this.setImage(image);
	}
}
