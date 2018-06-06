package myView;
/**
 * <h1>MainFrame JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//test of a popup displayer used for exemple when an incorrect string is returned by the database
public class MainFrameTest 
{
	@Test
	public void run() 
	{
			
	}
	
	@Test
	public void displayMessage() 
	{
		String message = "test"; /**assign String "test" to a String variable which will be used for the popup*/
		JOptionPane.showMessageDialog(null, message);
	}
	
	@Test
	public void exit() 
	{
		
	}
}
