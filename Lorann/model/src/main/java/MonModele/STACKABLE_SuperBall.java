package MonModele;
/**
 * <h1>The Class STACKABLE_SuperBall/h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see STACKABLE_StackableItem
 */
public class STACKABLE_SuperBall extends STACKABLE_StackableItem {
	
	private String image = "crystal_ball.png";
	private int collider = 4; //DEAD OF PLAYER
	
	public STACKABLE_SuperBall( )
	{
		this.setName("superball");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
