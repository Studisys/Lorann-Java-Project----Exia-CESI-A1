package myModel;

/**
 * <h1>The Class LorannModel</h1>
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 * @see INTERFACE_Model
 */

import java.util.ArrayList;
import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Class LorannModel.
 */
@SuppressWarnings("deprecation")
public class LorannModel extends Observable implements INTERFACE_Model {

	/** The mobile. */
	private ArrayList<INTERFACE_Mobile> mobile;
	
	/** The map. */
	public char map[][];
	
	/** The my map. */
	private Map myMap;
	
	/** The level. */
	private String level;
	
	/** The item list. */
	private Item[][] itemList;
	
	/** The monster list. */
	private ArrayList<MOVABLEITEM_MovableItem> monsterList;
	
	/** The lorann. */
	private Item lorann;
	
	/** The door position. */
	private Position doorPosition;

	/**
	 * Instantiates a new lorann model.
	 */
	public LorannModel()
	{
		this.mobile = new ArrayList<INTERFACE_Mobile>();
		this.myMap = new Map();
	}
	
	
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 *  Build map from the level setting.
	 *
	 * @param level the level
	 */
	public void mapCreator (String level)
	{
		this.myMap.buildMap(level);
		this.itemList = this.myMap.getListItem();
		this.monsterList = this.myMap.getListMonster();
		this.lorann = this.myMap.getLorann();
		this.doorPosition = this.myMap.getDoorPosition();
		this.map = this.myMap.map2D;
	}
	
	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#addMobile(myModel.INTERFACE_Mobile)
	 */
	@Override
	public void addMobile(INTERFACE_Mobile Mobile) 
	{
		this.mobile.add(Mobile);
	}

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#removeMobile(myModel.INTERFACE_Mobile)
	 */
	@Override
	public void removeMobile(INTERFACE_Mobile Mobile) 
	{
		this.mobile.remove(Mobile);
	}

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#getMobiles()
	 */
	@Override
	public ArrayList<INTERFACE_Mobile> getMobiles() 
	{
		return this.mobile;
	}

	/**
	 *  Refresh view.
	 */
	@Override
	public void setMobilesHavedMove() 
	{
		this.setChanged();
		this.notifyObservers();
	}


	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#getItemList()
	 */
	@Override
	public Item[][] getItemList() {
		return itemList;
	}
	
	/**
	 *  Set items in array.
	 *
	 * @param item the item
	 * @param x the x
	 * @param y the y
	 */
	public void setItemList(Item item, int x, int y) {
		this.itemList[y][x] = item;
	}

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#getMonsterList()
	 */
	@Override
	public ArrayList<MOVABLEITEM_MovableItem> getMonsterList() {
		return monsterList;
	}
	

	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#setMonsterList(myModel.Item)
	 */
	public void setMonsterList(Item item) {
		this.monsterList = monsterList;
	}



	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#getLorann()
	 */
	public Item getLorann() {
		return lorann;
	}
	
	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#getMap()
	 */
	public char[][] getMap() 
	{
		return map;
	}
	
	/* (non-Javadoc)
	 * @see myModel.INTERFACE_Model#getDoorPosition()
	 */
	public Position getDoorPosition() {
		return doorPosition;
	}
	
}
