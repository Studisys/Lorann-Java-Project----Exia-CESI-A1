package MonModele;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Example;
import model.dao.LorannDAO;

public class main {


	private static String level;
	
	public static void main(String[] args) throws SQLException {

		
		// Joel's part is below :
		
		// Asking the user for the level number
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
		
		// Assign Answer from Server to level string
		level = String.valueOf(daoReturn);
		
		
		// Nicolas part is below :
		
		Map maMap = new Map();
		maMap.buildMap(level);
		
		JFrame window = new JFrame();
	    window.setSize(1200, 720);
	    window.setTitle("Lorann");
	    window.setLocationRelativeTo(null);
	    window.setResizable(false);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Panel pan = new Panel();
	    
	    window.setContentPane(pan);
		window.setVisible(true);

	}

}
