package MonModele;

import java.util.ArrayList;

/**
 * <h1>The Interface INTERFACE_Model</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */
public interface INTERFACE_Model {

	
	public void addMobile(INTERFACE_Mobile Mobile);
	public void removeMobile(INTERFACE_Mobile Mobile);
	public ArrayList<INTERFACE_Mobile> getMobiles();
	public void setMobilesHavedMove();
	public Item[][] getItemList();
	public ArrayList<Item> getMonsterList();
	public Item getLorann();
	public char[][] getMap();
	
}
