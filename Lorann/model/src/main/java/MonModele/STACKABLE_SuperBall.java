package MonModele;
/**********************************************************************************
**																				 **
**							  	Class CrystalBall								 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class STACKABLE_SuperBall extends STACKABLE_StackableItem {
	
	private String image = "../model/images/crystal_ball.png";
	
	public STACKABLE_SuperBall( )
	{
		this.setName("superball");
		this.setImage(image);
	}

}
