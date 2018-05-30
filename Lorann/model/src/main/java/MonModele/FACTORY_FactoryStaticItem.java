package MonModele;

/**********************************************************************************
**																				 **
**							  Factory StaticItem								 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/

public class FACTORY_FactoryStaticItem {
	
	private Item item;
	
	public FACTORY_FactoryStaticItem()
	{
		
	}
	
	public Item createItem(char changer)
	{		
		switch (changer)
		{
		case 'W':
			return new STACKABLE_Purse();
		
			
		case 'B':
			return new STACKABLE_SuperBall();
			
			
		case 'J':
			return new WALL_BoneWallH();
			
		
		case 'X':
			return new WALL_BoneWallY();
			
			
		case 'A':
			return new WALL_Pillar();
			
			
		case 'H':
			return new WALL_Door();
			
		case 'Y':
			return new WALL_Void();
			
		default:
			this.item = new FACTORY_MovableItem().createMoveItem(changer);
			return this.item;
		}
	}
	
	
}
