package MonModele;
/**********************************************************************************
**																				 **
**							  	  Class Void							 		 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class WALL_Void extends WALL_Wall {

	//IMAGE gate-closed
	private String image = "void.png";
	public WALL_Void()
	{
		this.setName("void");
		this.setImage(image);
	}
}
