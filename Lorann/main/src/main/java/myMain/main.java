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
	
	public static void main (String[] args) throws SQLException
	{
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
		Example daoReturn;
		
		// Store answer from MySQL server to daoReturn object
		daoReturn=LorannDAO.getLevelMapById(userIntInput);
		System.out.println("Map String Answer from MySQL server : " + daoReturn);
		
		// Instantiate LorannModel
				LorannModel lorannmodel = new LorannModel();
				
		// Assign Answer from Server to level string
		lorannmodel.setLevel(String.valueOf(daoReturn));
		
		lorannmodel.mapCreator(lorannmodel.getLevel());

		LorannController loranncontroller = new LorannController(lorannmodel);
		
		MainFrame lorannview = new MainFrame(loranncontroller,lorannmodel, lorannmodel);
		
		loranncontroller.setViewSystem(lorannview);
		
		loranncontroller.play();
				
	}
}
