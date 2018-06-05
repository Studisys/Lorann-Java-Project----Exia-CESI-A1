package MonModele;
/**
 * <h1>The Class WALL_Pillar</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see WALL_Wall
 */
public class WALL_Pillar extends WALL_Wall {
	
	//IMAGE bone
	private String image = "bone.png";
	
	public WALL_Pillar()
	{

		this.setName("pillar");
		this.setImage(image);
	}
}
