package MonModele;
/**********************************************************************************
**																				 **
**							  Class Wall_Vertical								 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class WALL_BoneWallY extends WALL_Wall {

	//IMAGE vertical_bone
	private String image = "vertical_bone.png";
	
	public WALL_BoneWallY( )
	{
		this.setName("boneY");
		this.setImage(image);
	}
}
