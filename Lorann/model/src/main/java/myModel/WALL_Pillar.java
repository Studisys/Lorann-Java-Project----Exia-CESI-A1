package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Class WALL_Pillar</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see WALL_Wall
 */
public class WALL_Pillar extends WALL_Wall {
	
	/** The image. */
	//IMAGE bone
	private String image = "bone.png";
	
	/**
	 * Instantiates a new WAL L pillar.
	 */
	public WALL_Pillar()
	{

		this.setName("pillar");
		this.setImage(image);
	}
}
