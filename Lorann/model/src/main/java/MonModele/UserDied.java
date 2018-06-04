package MonModele;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Example;
import model.dao.LorannDAO;
import java.sql.SQLException;

public class UserDied {
	
	public String UserScore;
	public String level;
	public void UserDiedPopup() throws SQLException
	{

JFrame frame = new JFrame("Lorann - You died !");
		frame.setTitle("Lorann - You died !");
		String userLevelInput = JOptionPane.showInputDialog(frame, "You died ! Your score is : " + UserScore + "Please enter the level you wish to try : ", "Lorann - You died !", JOptionPane.PLAIN_MESSAGE);
						
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
		
		// Assign Answer from Server to level string
		level = String.valueOf(daoReturn);
    }

}