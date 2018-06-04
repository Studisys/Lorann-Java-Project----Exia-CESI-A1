package maVue;
import java.sql.SQLException;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import MonModele.INTERFACE_Model;
import MonModele.Map;
import model.Example;
import model.dao.LorannDAO;
import monController.iOrderPerformer;


public class MainFrame implements java.lang.Runnable,iView {
	private final GraphicsBuilder graphicsBuilder;
	private final Event	eventPerformer;
	private final Observable observable;
	private GameFrame gameFrame;
	private String level;
	private Map myMap;
	
	public MainFrame(iOrderPerformer orderPerformer,INTERFACE_Model LorannModel,Observable observable)
	{
		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(LorannModel);
		this.eventPerformer = new Event(orderPerformer);
		SwingUtilities.invokeLater(this);
	}
	
	public void run()
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
		this.level = String.valueOf(daoReturn);
		
		this.gameFrame = new GameFrame("Lorann", this.eventPerformer, this.graphicsBuilder, observable);

	}
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);

	}
	public void exit()
	{
		this.gameFrame.dispose();
	}
}
