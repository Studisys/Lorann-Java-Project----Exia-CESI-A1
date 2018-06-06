package myView;
import java.awt.event.KeyEvent;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * <h1>The Class GameFrame</h1>
 * * * * To set the view and perform refresh
 * This implementation causes problems in repainting...
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see JFrame
 */
public class GameFrame extends JFrame implements java.awt.event.KeyListener{
	private static final long serialVersionUID = 1L;
	private final iEventPerformer	eventPerformer;
	public boolean[] isKeyPressed;
	
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
	@Override
	public void keyPressed(KeyEvent keyEvent)
	{
	
		this.eventPerformer.event(keyEvent);
	}
	@Override
	public void keyReleased(KeyEvent keyEvent)
	{
		//isKeyPressed = false;
	}
	@Override
	public void keyTyped(KeyEvent keyEvent)
	{
		
	}
}
