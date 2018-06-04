package MonModele;
/**********************************************************************************
**																				 **
**							  General Class Wall								 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public abstract class WALL_Wall extends Item {
	private int collider = 0; //COLLISION
	
	public WALL_Wall()
	{
		this.setColliderPermission(this.collider);
	}

}
