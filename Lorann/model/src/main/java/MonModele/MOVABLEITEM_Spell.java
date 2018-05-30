package MonModele;
/**********************************************************************************
**																				 **
**							  	   Class Spell								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/
public class MOVABLEITEM_Spell extends MOVABLEITEM_MovableItem {

	
	private int speed;
	private int maxDistanceTraveled;
	private int distanceTraveled;
	private String image;
	
	public MOVABLEITEM_Spell(Direction direction)
	{
		
	}
	
	public int getWidthWithADirection()
	{
		return 0;
	}
	
	public int getHeightWithADirection()
	{
		return 0;
	}
	
	public void launch()
	{
			for(int i = 0; i<8;i++)
			{
				this.image = "/images/" + SPRITE_SpellSprite.values()[i].toString();
				this.setImage(this.image);
			}
	}
	
}
