package MonModele;

import java.sql.SQLException;

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
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Example;
import model.dao.LorannDAO;

public class LorannModel extends Observable implements INTERFACE_Model {

	private ArrayList<INTERFACE_Mobile> mobile;
	protected char map[][];
	private Map myMap;
	
	private String level;
	
	
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

}
