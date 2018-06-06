package myModel;
/**
 * <h1>The Class STACKABLE_SuperBall</h1>
 * * * Class for the stackable (grab) item "Crystal Ball"
 * Is  possible to grab : collider = 5
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see STACKABLE_StackableItem
 */
public class STACKABLE_SuperBall extends STACKABLE_StackableItem {
	
	private String image = "crystal_ball.png";
	private int collider = 5;
	
	public STACKABLE_SuperBall( )
	{
		this.setName("superball");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
