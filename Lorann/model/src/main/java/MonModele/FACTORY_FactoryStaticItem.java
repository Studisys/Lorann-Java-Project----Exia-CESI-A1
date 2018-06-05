package MonModele;

import java.util.ArrayList;

/**
 * <h1>The Class FACTORY_FactoryStaticItem</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */

public class FACTORY_FactoryStaticItem {
	
	private ArrayList<MOVABLEITEM_Ennemy> movable;
	private Item lorann;
	private Position doorPosition;

	public FACTORY_FactoryStaticItem()
	{
		this.movable = new ArrayList<MOVABLEITEM_Ennemy>();
	}
	
	public Item createItem(char changer, int x, int y)
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
			this.setDoorPosition(new Position(x, y));
			return new WALL_Door();
			
		case 'Y':
			return new WALL_Void();
		case 'S':
			MOVABLEITEM_Ennemy monstre1 = new MONSTER_Ghost();
			monstre1.setPosition(new Position(x,y));
			this.movable.add(monstre1);
			return new WALL_Void();
			
		case 'T':
			MOVABLEITEM_Ennemy monstre2 = new MONSTER_Skull();
			monstre2.setPosition(new Position(x,y));
			this.movable.add(monstre2);
			return new WALL_Void();
		case 'U':
			MOVABLEITEM_Ennemy monstre3 = new MONSTER_TotemMan();
			monstre3.setPosition(new Position(x,y));
			this.movable.add(monstre3);
			return new WALL_Void();
		case 'V':
			MOVABLEITEM_Ennemy monstre4 = new MONSTER_StormTrooper();
			monstre4.setPosition(new Position(x,y));
			this.movable.add(monstre4);
			return new WALL_Void();
		case 'K':
			this.lorann = new MOVABLEITEM_Me();
			lorann.setPosition(new Position(x,y));
			return new WALL_Void();
	
			
		default:
			return new WALL_Void();
		
		}
	}
	public Position getDoorPosition() {
		return doorPosition;
	}

	public void setDoorPosition(Position doorPosition) {
		this.doorPosition = doorPosition;
	}
	public ArrayList<MOVABLEITEM_Ennemy> getMovable() {
		return movable;
	}

	public Item getLorann() {
		return lorann;
	}
	
}
