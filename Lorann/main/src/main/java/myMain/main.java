package myMain;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MonModele.LorannModel;
import maVue.*;
import model.Example;
import model.dao.LorannDAO;
import monController.LorannController;

public class main {

	public String level;
	
	public static void main (String[] args) 
	
	{
		try
		{
			
				JFrame frame = new JFrame("Lorann");
				frame.setTitle("Lorann");
				String userLevelInput = JOptionPane.showInputDialog(frame, "Please enter the level number you wish to be loaded :", "Lorann - Enter the desired level number", JOptionPane.PLAIN_MESSAGE);
								
				if (userLevelInput.equals(null)) 		// If users closes Input Window, kill the process.
				{
					System.out.println("User closed the input window ! Aborting...");
					System.exit(0);
				}
				
		
				int userIntInput = Integer.parseInt(userLevelInput); 		// Cast user input (String) to Integer
				System.out.println("User chose the level number : " + userIntInput);
		
				Example daoReturn;		// New object of type Example
				
				daoReturn=LorannDAO.getLevelMapById(userIntInput);	// Store answer from MySQL server to daoReturn object
				System.out.println("Map String Answer from MySQL server : " + daoReturn);
				
				LorannModel lorannmodel = new LorannModel();		// Instantiate LorannModel
						
				lorannmodel.setLevel(String.valueOf(daoReturn));		// Assign Answer from Server to level string
				lorannmodel.mapCreator(lorannmodel.getLevel());
		
				LorannController loranncontroller = new LorannController(lorannmodel);
				MainFrame lorannview = new MainFrame(loranncontroller,lorannmodel, lorannmodel);
				
				loranncontroller.setViewSystem(lorannview);
				loranncontroller.play();
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
