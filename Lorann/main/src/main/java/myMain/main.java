package myMain;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MonModele.LorannModel;
import MonModele.MOVABLEITEM_Ennemy;
import MonModele.MOVABLEITEM_Me;
import MonModele.levelCheck;
import maVue.MainFrame;
import model.Example;
import model.dao.LorannDAO;
import monController.LorannController;

/**
 * <h1>The Class Main</h1>
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 */
public class main {

	public String level;
	
	public static void main (String[] args) 
	
	{
		try
		{

			Thread ennemy = new Thread(new MOVABLEITEM_Ennemy());
			Thread moi = new Thread(new MOVABLEITEM_Me());
			moi.start();
			ennemy.start();

				levelCheck levelTester = new levelCheck();
				boolean levelChecker;
				JFrame frame3 = new JFrame("Lorann");
				frame3.setTitle("Lorann");
				String userLevelInput = JOptionPane.showInputDialog(frame3, "Please enter the level number you wish to be loaded :", "Lorann - Enter the desired level number", JOptionPane.PLAIN_MESSAGE);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				System.exit(JFrame.EXIT_ON_CLOSE);
		        
				if (userLevelInput.equals(null)) 		// If users closes Input Window, kill the process.
				{
					System.out.println("User closed the input window ! Aborting...");
					System.exit(JFrame.EXIT_ON_CLOSE);
				}
				
		
				int userIntInput = Integer.parseInt(userLevelInput); 		// Cast user input (String) to Integer
				System.out.println("User chose the level number : " + userIntInput);
		
				Example daoReturn;		// New object of type Example
				
				daoReturn=LorannDAO.getLevelMapById(userIntInput);	// Store answer from MySQL server to daoReturn object
				System.out.println("Map String Answer from MySQL server : " + daoReturn);
				
				LorannModel lorannmodel = new LorannModel();		// Instantiate LorannModel
				
				levelChecker = levelTester.check(String.valueOf(daoReturn));
				
				if(levelChecker == true)
				{
					lorannmodel.setLevel(String.valueOf(daoReturn));		// Assign Answer from Server to level string
					lorannmodel.mapCreator(lorannmodel.getLevel());
		
					LorannController loranncontroller = new LorannController(lorannmodel);
					MainFrame lorannview = new MainFrame(loranncontroller,lorannmodel, lorannmodel);
				

				loranncontroller.setViewSystem(lorannview);
				loranncontroller.play();


					loranncontroller.setViewSystem(lorannview);
					loranncontroller.play();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid String for DataBase");
					System.out.println("Invalid string");
				}

		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
