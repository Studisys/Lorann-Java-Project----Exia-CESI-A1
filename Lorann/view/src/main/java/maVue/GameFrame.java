package maVue;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/**
 * <h1>The Class GameFrame</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see JFrame
 */
public class GameFrame extends JFrame implements java.awt.event.KeyListener{
	private static final long serialVersionUID = 1L;
	private final iEventPerformer	eventPerformer;
	public boolean isKeyPressed;
	public GameFrame(String title,iEventPerformer performer, iGraphicsBuilder graphicsBuilder, Observable observable)
	{
		this.eventPerformer = performer;
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setVisible(true);

		try {
		URL url = this.getClass().getClassLoader().getResource("../model/sound/sound.wav");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
		isKeyPressed = false;
	}
	@Override
	public void keyTyped(KeyEvent keyEvent)
	{
		
	}
}
