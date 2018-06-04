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
	
	private String image = "../model/images/purse.png";
	
	public STACKABLE_Purse( )
	{
		this.setName("purse");
		this.setImage(image);
		
	}

}
