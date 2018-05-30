package maVue;
import java.util.Observable;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import MonModele.INTERFACE_Model;
import monController.iOrderPerformer;


public class MainFrame implements java.lang.Runnable,iView {
	private final GraphicsBuilder graphicsBuilder;
	private final Event	eventPerformer;
	private final Observable observable;
	private GameFrame gameFrame;
	
	public MainFrame(iOrderPerformer orderPerformer,INTERFACE_Model LorannModel,Observable observable)
	{
		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(LorannModel);
		this.eventPerformer = new Event(orderPerformer);
		SwingUtilities.invokeLater(this);
	}
	
	public void run() 
	{
		this.gameFrame = new GameFrame("Lorann", this.eventPerformer, this.graphicsBuilder, this.observable);

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
