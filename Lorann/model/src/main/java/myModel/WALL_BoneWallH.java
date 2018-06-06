package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class WALL_BoneWallH</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see WALL_Wall
 */


public class WALL_BoneWallH extends WALL_Wall {

	/** The image. */
	//IMAGE horizontal_bone
	private String image = "horizontal_bone.png";
	
	/**
	 * Instantiates a new WAL L bone wall H.
	 */
	public WALL_BoneWallH( )
	{
		this.setName("boneH");
		this.setImage(this.image);
	}
}
