package MonModele;

import java.util.ArrayList;

public interface iModel {

	
	public void addMobile(iMobile Mobile);
	public void removeMobile(iMobile Mobile);
	public ArrayList<iMobile> getMobiles();
	public void setMobilesHavedMove();
	public void buildMap();
	public void addItems(Item item);
	public void removeItem(Item item);
	public void addDoor();	
	
}
