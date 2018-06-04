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

		private Image gate;
		private Image wallH;
		private Image wallY;
		private Image pillar;
		private Image superball;
		private Image m1;
		private Image m2;
		private Image m3;
		private Image m4;
		private Image lorann;
		private Image purse;
		private Image vide;
		
		private char[][] map;
	
	public Panel(char map[][])
	{
		this.map = map;
		try
		{
			
		
		for (int i = 0; i<=11; i++)
		{
			for (int j = 0; j<=19; j++)
			{
				switch (this.map[i][j])
				{
				case 'W':
					this.purse = ImageIO.read(new File("../model/images/purse.png"));
				case 'B':
					this.superball = ImageIO.read(new File("../model/images/crystal_ball.png"));
				case 'J':
					this.wallH = ImageIO.read(new File("../model/images/horizontal_bone.png"));
				case 'X':
					this.wallY = ImageIO.read(new File("../model/images/vertical_bone.png"));
				case 'A':
					this.pillar = ImageIO.read(new File("../model/images/bone.png"));	
				case 'H':
					this.gate = ImageIO.read(new File("../model/images/gate_closed.png"));
				case 'Y':
					this.vide = ImageIO.read(new File("../model/images/void.png"));	
				case 'S':
					this.m1 = ImageIO.read(new File("../model/images/monster_1.png"));
				case 'T':
					this.m2 = ImageIO.read(new File("../model/images/monster_2.png"));
				case 'U':
					this.m3 = ImageIO.read(new File("../model/images/monster_3.png"));
				case 'V':
					this.m4 = ImageIO.read(new File("../model/images/monster_4.png"));
				case 'K':
					this.lorann = ImageIO.read(new File("../model/images/lorann_l.png"));
				/*default:
					this.image = ImageIO.read(new File("../model/images/void.png"));*/
				}
			}
		}
		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g)
	{
		
			for (int i = 0; i<=11; i++)
			{
				for (int j = 0; j<=19; j++)
				{
					switch (this.map[i][j])
					{
					case 'W':
					//	g.drawImage(this.purse, 32 * j, 32 * i, this);
						g.drawImage(this.purse, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'B':
						g.drawImage(this.superball, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'J':
						g.drawImage(this.wallH, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'X':
						g.drawImage(this.wallY, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'A':
						g.drawImage(this.pillar, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'H':
						g.drawImage(this.gate, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'Y':
						g.drawImage(this.vide, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'S':
						g.drawImage(this.m1, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'T':
						g.drawImage(this.m2, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'U':
						g.drawImage(this.m3, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'V':
						g.drawImage(this.m4, 48*j+40, 48*i+40, 48, 48, this);
						break;
					case 'K':
						g.drawImage(this.lorann, 48*j+40, 48*i+40, 48, 48, this);
						break;
					}
				}
			}
			/*this.image = ImageIO.read(new File("../model/images/lorann_l.png"));
			g.drawImage(this.image, 0, 0, null);*/
			
			//g.drawRect(40, 40, 40, 40);
	
		
	}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.repaint();
	}
	
}
