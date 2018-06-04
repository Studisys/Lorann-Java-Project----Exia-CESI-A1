package maVue;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;


//use grid panel
class GamePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private final iGraphicsBuilder	graphicsBuilder;
	private char map[][];

	public GamePanel(iGraphicsBuilder graphicsBuilder)
	{
		this.graphicsBuilder = graphicsBuilder;
		this.map = map;
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
