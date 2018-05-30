package MonModele;
/**********************************************************************************
**																				 **
**							  Class Wall_Horizontal								 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
import java.awt.Image;

public class WALL_BoneWallH extends WALL_Wall {

	//IMAGE horizontal_bone
	private String image = "C:/Users/Nicolas Drapier/git/Lorann-Java-Project----Exia-CESI-A1/Lorann/model/images/horizontal_bone.png";
	public WALL_BoneWallH( )
	{
		this.setName("boneH");
		this.setImage(this.image);
	}
}
