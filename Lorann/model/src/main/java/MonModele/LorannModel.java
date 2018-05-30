package MonModele;

/**********************************************************************************
**																				 **
**							      Main model								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/

import java.util.ArrayList;

public class LorannModel implements INTERFACE_Model {

	
	public LorannModel()
	{
		
	}
	
	
	
	@Override
	public void addMobile(INTERFACE_Mobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(INTERFACE_Mobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<INTERFACE_Mobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavedMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItems(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDoor() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void buildMap(String level) {
		// TODO Auto-generated method stub
		Map myMap = new Map();
		myMap.buildMap(level);
	}

}
