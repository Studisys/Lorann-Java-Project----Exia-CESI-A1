package myView;

import java.util.Observable;


import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import myModel.INTERFACE_Model;

import myController.iOrderPerformer;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class MainFrame</h1>
 * Instantiates new gameframe.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */

public class MainFrame implements java.lang.Runnable,iView {
	
	/** The graphics builder. */
	private final GraphicsBuilder graphicsBuilder;
	
	/** The event performer. */
	private final Event	eventPerformer;
	
	/** The observable. */
	private final Observable observable;
	
	/** The game frame. */
	private GameFrame gameFrame;
	
	/**
	 * Instantiates a new main frame.
	 *
	 * @param orderPerformer the order performer
	 * @param LorannModel the lorann model
	 * @param observable the observable
	 */
	public MainFrame(iOrderPerformer orderPerformer,INTERFACE_Model LorannModel,Observable observable)
	{
		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(LorannModel);
		this.eventPerformer = new Event(orderPerformer);
		SwingUtilities.invokeLater(this);
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run()
	{	
		this.gameFrame = new GameFrame("Lorann", this.eventPerformer, this.graphicsBuilder, observable);
	}
	
	/**
	 * Display message.
	 *
	 * @param message the message
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);

	}
	
	/**
	 * Exit.
	 */
	public void exit()
	{
		this.gameFrame.dispose();
	}
}
