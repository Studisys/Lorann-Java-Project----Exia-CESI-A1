package MonModele;

/**
 * <h1>The Class LorannModel</h1>
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 * @see INTERFACE_Model
 */

import java.util.ArrayList;
import java.util.Observable;

public class LorannModel extends Observable implements INTERFACE_Model {

	private ArrayList<INTERFACE_Mobile> mobile;
	public char map[][];
	private Map myMap;
	
	private String level;
	
	private Item[][] itemList;
	private ArrayList<MOVABLEITEM_Ennemy> monsterList;
	private Item lorann;
	private Position doorPosition;

	public LorannModel()
	{
		this.mobile = new ArrayList<INTERFACE_Mobile>();
		this.myMap = new Map();
	}
	
	
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}


	public void mapCreator (String level)
	{
		this.myMap.buildMap(level);
		this.itemList = this.myMap.getListItem();
		this.monsterList = this.myMap.getListMonster();
		this.lorann = this.myMap.getLorann();
		this.doorPosition = this.myMap.getDoorPosition();
		this.map = this.myMap.map2D;
	}
	
	@Override
	public void addMobile(INTERFACE_Mobile Mobile) 
	{
		this.mobile.add(Mobile);
	}

	@Override
	public void removeMobile(INTERFACE_Mobile Mobile) 
	{
		this.mobile.remove(Mobile);
	}

	@Override
	public ArrayList<INTERFACE_Mobile> getMobiles() 
	{
		return this.mobile;
	}

	@Override
	public void setMobilesHavedMove() 
	{
		this.setChanged();
		this.notifyObservers();
	}


	@Override
	public Item[][] getItemList() {
		return itemList;
	}
	

	public void setItemList(Item item, int x, int y) {
		this.itemList[y][x] = item;
	}

	@Override
	public ArrayList<MOVABLEITEM_Ennemy> getMonsterList() {
		return monsterList;
	}

	public Item getLorann() {
		return lorann;
	}
	
	public char[][] getMap() 
	{
		return map;
	}
	public Position getDoorPosition() {
		return doorPosition;
	}
	
}
