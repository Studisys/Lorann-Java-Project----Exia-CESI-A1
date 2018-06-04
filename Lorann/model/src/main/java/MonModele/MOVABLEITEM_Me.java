package MonModele;
/**********************************************************************************
**																				 **
**							  	   Class Hero								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class MOVABLEITEM_Me extends MOVABLEITEM_MovableItem {

	private int speed = 10;
	private String image = "../model/images/lorann_l.png";
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
			this.image = "C:/Users/Nicolas Drapier/git/Lorann-Java-Project----"
					+ "Exia-CESI-A1/Lorann/model/images/" + SPRITE_MeSprite.values()[i].toString() + ".png";
			this.setImage(this.image);
		}
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	
}
