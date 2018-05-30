package MonModele;

/**********************************************************************************
**																				 **
**							  Factory MovableItem								 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/

public class FACTORY_MovableItem {
	
	public FACTORY_MovableItem()
	{
		
	}
	
	public Item createMoveItem(char changer)
	{
		switch (changer)
		{
		case 'S':
			return new MONSTER_Ghost();
		case 'T':
			return new MONSTER_Skull();
		case 'U':
			return new MONSTER_TotemMan();
		case 'V':
			return new MONSTER_StormTrooper();
		case 'K':
			return new MOVABLEITEM_Me();
		default:
			return new WALL_Void();
		}
	}
}
