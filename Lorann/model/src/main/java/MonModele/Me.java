package MonModele;

public class Me extends Movable {

	private int speed;
	private String image;
	private boolean weaponed;
	
	
	public Me()
	{
		
	}
	
	public boolean isWeapon()
	{
		return true;
	}
	
	public void dontMove()
	{
		for(int i = 0; i<8;i++)
		{
			this.image = "/images/" + MeSprite.values()[i].toString();
			this.setImage(this.image);
		}
	}
	
	
}
