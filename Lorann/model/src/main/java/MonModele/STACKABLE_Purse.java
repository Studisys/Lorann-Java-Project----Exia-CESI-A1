package MonModele;
/**********************************************************************************
**																				 **
**							  	   Class Purse								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class STACKABLE_Purse extends STACKABLE_StackableItem {
	
	private String image = "purse.png";
	private int collider = 1; //STACKABLE
	
	public STACKABLE_Purse( )
	{
		this.setName("purse");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
