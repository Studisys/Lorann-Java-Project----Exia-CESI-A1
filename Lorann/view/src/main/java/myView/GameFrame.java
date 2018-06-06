/*
 * 
 */
package myView;
import java.awt.event.KeyEvent;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class GameFrame</h1>
 * * * * To set the view and perform refresh
 * This implementation causes problems in repainting...
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see JFrame
 */
public class GameFrame extends JFrame implements java.awt.event.KeyListener{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The event performer. */
	private final iEventPerformer	eventPerformer;
	
	/** The is key pressed. */
	public boolean[] isKeyPressed;
	
	/**
	 * Instantiates a new game frame.
	 *
	 * @param title the title
	 * @param performer the performer
	 * @param graphicsBuilder the graphics builder
	 * @param observable the observable
	 */
	public GameFrame(String title,iEventPerformer performer, iGraphicsBuilder graphicsBuilder, Observable observable)
	{
		this.eventPerformer = performer;
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setVisible(true);
		
		final GamePanel gamePanel = new GamePanel(graphicsBuilder);
	
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setContentPane(gamePanel);
		this.setSize(966, 605);
		this.setLocationRelativeTo(null);
		observable.addObserver(gamePanel);

		this.setVisible(true);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent keyEvent)
	{
	
		this.eventPerformer.event(keyEvent);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent keyEvent)
	{
		//isKeyPressed = false;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent keyEvent)
	{
		
	}
}
