package MonModele;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel implements Observer {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private Image image;
	
	int h = 0;
	public Panel()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		try
		{
			this.image = ImageIO.read(new File("C:/Users/Nicolas Drapier/git/Lorann-Java-Project----Exia-CESI-A1/Lorann/model/images/lorann_u.png"));
			g.drawImage(this.image, 40, 40, Color.BLACK, this);
			//g.drawRect(40, 40, 40, 40);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.repaint();
	}
	
}
