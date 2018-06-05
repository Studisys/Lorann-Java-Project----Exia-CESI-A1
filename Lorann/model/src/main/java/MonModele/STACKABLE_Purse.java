package MonModele;
/**
 * <h1>The Class STACKABLE_Purse</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see STACKABLE_StackableItem
 */
public class STACKABLE_Purse extends STACKABLE_StackableItem {
	
	private String image = "purse.png";
	private int collider = 4; //STACKABLE
	
	public STACKABLE_Purse( )
	{
		this.setName("purse");
		this.setImage(image);
		this.setColliderPermission(this.collider);
	}

}
