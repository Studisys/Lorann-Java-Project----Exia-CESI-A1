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
	
	private String image = "crystal_ball.png";
	private int collider = 1; //DEAD OF PLAYER
	
	public STACKABLE_SuperBall( )
	{
		this.setName("superball");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
