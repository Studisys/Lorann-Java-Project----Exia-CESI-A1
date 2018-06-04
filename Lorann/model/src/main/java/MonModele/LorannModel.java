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
	
	public String level;
	public LorannModel()
	{
		this.mobile = new ArrayList<INTERFACE_Mobile>();
		this.myMap = new Map();
		
		JFrame frame = new JFrame("Lorann");
		frame.setTitle("Lorann");
		String userLevelInput = JOptionPane.showInputDialog(frame, "Please enter the level number you wish to be loaded :", "Lorann - Enter the desired level number", JOptionPane.PLAIN_MESSAGE);
						
		// If users closes Input Window, kill the process.
		if (userLevelInput.equals(null)) {
			System.out.println("User closed the input window ! Aborting...");
			System.exit(0);
		}
		
		// Cast user input (String) to Integer
		int userIntInput = Integer.parseInt(userLevelInput); 
		System.out.println("User chose the level number : " + userIntInput);
		
		// Instantiate LorannDAO to run getLevelMapById
		LorannDAO dao = new LorannDAO();
		
		// New object of type Example
		Example daoReturn = null;
		
		// Store answer from MySQL server to daoReturn object
		try
		{
			daoReturn=LorannDAO.getLevelMapById(userIntInput);
			System.out.println("Map String Answer from MySQL server : " + daoReturn);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		
		// Assign Answer from Server to level string
		level = String.valueOf(daoReturn);
		myMap.buildMap(level);
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
