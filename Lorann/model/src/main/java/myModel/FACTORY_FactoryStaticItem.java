package myModel;

import java.util.ArrayList;

/**
 * <h1>The Class FACTORY_FactoryStaticItem</h1>
 * This Factory generates the items depending on the letters present in the passed string as parameter)
 * @author Nicolas DRAPIER
 * @version 0.1
 */

public class FACTORY_FactoryStaticItem {
	
	private ArrayList<MOVABLEITEM_MovableItem> movable;
	private Item lorann;
	private Position doorPosition;

	public FACTORY_FactoryStaticItem()
	{
		this.movable = new ArrayList<MOVABLEITEM_MovableItem>();
	}
	
	/**createItem : return an item depending on a character from the string passed in parameter as changer
	 * 
	 * W = Purse
	 * B = Crystal Ball
	 * J = Horizontal Bone
	 * X = Vertical Bone
	 * A = Pillar
	 * H = (closed) door
	 * Y = nothing / empty
	 * S = monster 1
	 * T = monster 2
	 * U = monster 3
	 * V = monster 4
	 * K = Lorann
	 * @param changer
	 * @param x
	 * @param y
	 * @return
	 */
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
			MOVABLEITEM_MovableItem monster1 = new MONSTER_Ghost();
			monster1.setPosition(new Position(x,y));
			this.movable.add(monster1);
			return new WALL_Void();
			
		case 'T':
			MOVABLEITEM_MovableItem monster2 = new MONSTER_Skull();
			monster2.setPosition(new Position(x,y));
			this.movable.add(monster2);
			return new WALL_Void();
		case 'U':
			MOVABLEITEM_MovableItem monster3 = new MONSTER_TotemMan();
			monster3.setPosition(new Position(x,y));
			this.movable.add(monster3);
			return new WALL_Void();
		case 'V':
			MOVABLEITEM_MovableItem monster4 = new MONSTER_StormTrooper();
			monster4.setPosition(new Position(x,y));
			this.movable.add(monster4);
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
	public ArrayList<MOVABLEITEM_MovableItem> getMovable() {
		return movable;
	}

	public Item getLorann() {
		return lorann;
	}
	
}
