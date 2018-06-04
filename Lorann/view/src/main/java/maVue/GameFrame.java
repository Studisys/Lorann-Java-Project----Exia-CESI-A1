package maVue;
import java.awt.event.KeyEvent;
import java.util.Observable;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements java.awt.event.KeyListener{
	private static final long serialVersionUID = 1L;
	private final iEventPerformer	eventPerformer;
	
	public GameFrame(String title,iEventPerformer performer, iGraphicsBuilder graphicsBuilder, Observable observable)
	{
		this.eventPerformer = performer;
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setVisible(true);

		final GamePanel gamePanel = new GamePanel(graphicsBuilder);
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
		
	}
	@Override
	public void keyTyped(KeyEvent keyEvent)
	{
		
	}
}
