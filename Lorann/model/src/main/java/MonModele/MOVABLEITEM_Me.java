package MonModele;

public class MOVABLEITEM_Me extends MOVABLEITEM_MovableItem {

	private int speed = 10;
	private String image = "C:/Users/Nicolas Drapier/git/Lorann-Java-Project----Exia-CESI-A1/Lorann/model/images/lorann_l.png";
	private boolean weaponed = true;
	
	
	public MOVABLEITEM_Me()
	{
		this.setName("Lorann");
		this.setImage(image);
	}
	
	public boolean isWeapon()
	{
		return this.weaponed;
	}
	
	public void dontMove()
	{
		for(int i = 0; i<8;i++)
		{
			this.image = "/images/" + SPRITE_MeSprite.values()[i].toString();
			this.setImage(this.image);
		}
	}
	
	
}
