package myMain;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import myModel.LorannModel;
import myModel.MOVABLEITEM_Ennemy;
import myModel.MOVABLEITEM_Me;
import myModel.levelCheck;
import myView.MainFrame;
import model.Example;
import model.dao.LorannDAO;
import myController.LorannController;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class Main</h1>.
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 */
@SuppressWarnings("unused")
public class main {

	/** The level. */
	public String level;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String[] args) 
	
	{
		try
		{
				levelCheck levelTester = new levelCheck();
				boolean levelChecker;
				JFrame frame3 = new JFrame("Lorann");
				frame3.setTitle("Lorann");
				String userLevelInput = JOptionPane.showInputDialog(frame3, "Please enter the level number you wish to be loaded :", "Lorann - Enter the desired level number", JOptionPane.PLAIN_MESSAGE);
				
				if (userLevelInput.equals(null)) 		// If users closes Input Window, kill the process.
				{
					System.out.println("User closed the input window !");

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
				
					Thread moi = new Thread(new LorannController(lorannmodel));
					moi.start();
					
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
		catch (ArrayIndexOutOfBoundsException e2)
		{
			e2.printStackTrace();
		}
	}
}
