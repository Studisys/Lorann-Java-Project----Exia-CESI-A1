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
	public Item getMobiles(int i);
	public void setMobilesHavedMove();
	
}
