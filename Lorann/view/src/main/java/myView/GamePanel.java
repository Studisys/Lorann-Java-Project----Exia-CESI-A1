/*
 * 
 */
package myView;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class GamePanel</h1>
 * * * * This repaints the view. Not working from anywhere. but allows to, at least, make Lorann move.
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see JPanel
 */
//use grid panel
public class GamePanel extends JPanel implements Observer {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The graphics builder. */
	private final iGraphicsBuilder	graphicsBuilder;

	/**
	 * Instantiates a new game panel.
	 *
	 * @param graphicsBuilder the graphics builder
	 */
	public GamePanel(iGraphicsBuilder graphicsBuilder)
	{
		this.graphicsBuilder = graphicsBuilder;
	}
	
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable observable, Object arg0)
	{
		this.repaint();
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics graphics)
	{
		this.graphicsBuilder.applyModelToGraphic(graphics, this);
	}
	
}
