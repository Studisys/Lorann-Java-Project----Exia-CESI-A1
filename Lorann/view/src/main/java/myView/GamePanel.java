package myView;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

/**
 * <h1>The Class GamePanel</h1>
 * * * * This repaints the view. Not working from anywhere. but allows to, at least, make Lorann move.
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see JPanel
 */
//use grid panel
public class GamePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private final iGraphicsBuilder	graphicsBuilder;

	public GamePanel(iGraphicsBuilder graphicsBuilder)
	{
		this.graphicsBuilder = graphicsBuilder;
	}
	@Override
	public void update(Observable observable, Object arg0)
	{
		this.repaint();
	}
	@Override
	public void paintComponent(Graphics graphics)
	{
		this.graphicsBuilder.applyModelToGraphic(graphics, this);
	}
	
}
