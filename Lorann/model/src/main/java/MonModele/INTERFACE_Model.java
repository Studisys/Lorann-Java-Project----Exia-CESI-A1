package MonModele;

import java.util.ArrayList;

/**********************************************************************************
**																				 **
**								Interface Model									 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/

public interface INTERFACE_Model {

	
	public void addMobile(INTERFACE_Mobile Mobile);
	public void removeMobile(INTERFACE_Mobile Mobile);
	public ArrayList<INTERFACE_Mobile> getMobiles();
	public void setMobilesHavedMove();
	public Item[][] getItemList();
	public ArrayList<Item> getMonsterList();
	
}
