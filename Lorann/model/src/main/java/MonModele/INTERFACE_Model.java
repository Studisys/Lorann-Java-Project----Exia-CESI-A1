package MonModele;

import java.util.ArrayList;

public interface INTERFACE_Model {

	
	public void addMobile(INTERFACE_Mobile Mobile);
	public void removeMobile(INTERFACE_Mobile Mobile);
	public ArrayList<INTERFACE_Mobile> getMobiles();
	public void setMobilesHavedMove();
	public void buildMap(String level);
	public void addItems(Item item);
	public void removeItem(Item item);
	public void addDoor();	
	
}
