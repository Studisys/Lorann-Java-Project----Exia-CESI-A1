package myModel;
/**
 * <h1>The Class WALL_BoneWallY</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see WALL_Wall
 */
public class WALL_BoneWallY extends WALL_Wall {

	//IMAGE vertical_bone
	private String image = "vertical_bone.png";
	
	public WALL_BoneWallY( )
	{
		this.setName("boneY");
		this.setImage(image);
	}
}
