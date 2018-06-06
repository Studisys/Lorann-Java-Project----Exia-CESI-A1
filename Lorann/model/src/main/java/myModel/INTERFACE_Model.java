package myModel;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Interface INTERFACE_Model</h1>.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */
public interface INTERFACE_Model {

	
	/**
	 * Adds the mobile.
	 *
	 * @param Mobile the mobile
	 */
	public void addMobile(INTERFACE_Mobile Mobile);
	
	/**
	 * Removes the mobile.
	 *
	 * @param Mobile the mobile
	 */
	public void removeMobile(INTERFACE_Mobile Mobile);
	
	/**
	 * Gets the mobiles.
	 *
	 * @return the mobiles
	 */
	public ArrayList<INTERFACE_Mobile> getMobiles();
	
	/**
	 * Sets the mobiles haved move.
	 */
	public void setMobilesHavedMove();
	
	/**
	 * Gets the item list.
	 *
	 * @return the item list
	 */
	public Item[][] getItemList();
	
	/**
	 * Sets the item list.
	 *
	 * @param item the item
	 * @param x the x
	 * @param y the y
	 */
	public void setItemList(Item item, int x, int y);
	
	/**
	 * Gets the monster list.
	 *
	 * @return the monster list
	 */
	public ArrayList<MOVABLEITEM_MovableItem> getMonsterList();
	
	/**
	 * Sets the monster list.
	 *
	 * @param item the new monster list
	 */
	public void setMonsterList(Item item);
	
	/**
	 * Gets the lorann.
	 *
	 * @return the lorann
	 */
	public Item getLorann();
	
	/**
	 * Gets the door position.
	 *
	 * @return the door position
	 */
	public Position getDoorPosition();
	
	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public char[][] getMap();
	
}
