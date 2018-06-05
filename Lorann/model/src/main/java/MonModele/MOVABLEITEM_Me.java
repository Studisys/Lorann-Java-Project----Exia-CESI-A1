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

	private int speed = 48;
	private String image = "lorann_l.png";
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
		
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public void update()
	{
		
	}
}
