package MonModele;
/**********************************************************************************
**																				 **
**							       Class Door								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class WALL_Door extends WALL_Wall {

	//IMAGE gate-closed
	private String image = "gate_closed.png";
	
	public WALL_Door()
	{
		this.setName("door");
		this.setImage(image);
	}
}
