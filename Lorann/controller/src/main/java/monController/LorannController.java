package monController;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MonModele.Direction;
import MonModele.INTERFACE_Mobile;
import MonModele.INTERFACE_Model;
import MonModele.Item;
import MonModele.MOVABLEITEM_Ennemy;
import MonModele.Position;
import MonModele.WALL_Door;
import MonModele.WALL_Void;
import maVue.iView;

/**
 * <h1>The Class LorannController.</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see IOrderPerformer
 */
//A class called LorannController
public class LorannController implements iOrderPerformer
{
	private int TIME_SLEEP = 30;
	public final INTERFACE_Model LorannModel;
	private boolean isGameOver = false;
	private iView viewSystem;
	private ArrayList<MOVABLEITEM_Ennemy> movable;
	private Item hero;
	private int SCORE = 0;

	private Thread m1, m2, m3, m4;
	private ThreadGroup monsterThread;
	
	
	private MonModele.Direction direction = null;
	

	private int posX, posY;
	
	public LorannController(final INTERFACE_Model LorannModel) 
	{
		this.LorannModel = LorannModel;
		this.hero = this.LorannModel.getLorann();
		/*this.monsterThread = new ThreadGroup("Monster");
		
		this.m1=new Thread(monsterThread, new MOVABLEITEM_Ennemy() );
		this.m2=new Thread(monsterThread, new MOVABLEITEM_Ennemy() );
		this.m3=new Thread(monsterThread, new MOVABLEITEM_Ennemy() );
		this.m4=new Thread(monsterThread, new MOVABLEITEM_Ennemy() );
		
		this.m1.start();
		this.m2.start();
		this.m3.start();
		this.m4.start();*/
		
	}
	
	@Override
	public void orderPerform(iKeyOrder keyOrder)
	{	
		
		this.posX = this.hero.getPosition().getX();
		this.posY = this.hero.getPosition().getY();
		
			switch (keyOrder.getOrder())
			{
			case UP:
				this.getCollider(posX, posY - 1, Direction.UP);
				this.hero.setImage("lorann_u.png");
				break;
			case DOWN:
				this.getCollider(posX, posY + 1, Direction.DOWN);
				this.hero.setImage("lorann_b.png");
				break;
			case RIGHT:
				this.getCollider(posX +1 , posY, Direction.RIGHT);
				this.hero.setImage("lorann_r.png");
				break;
			case LEFT:
				this.getCollider(posX -1, posY, Direction.LEFT);
				this.hero.setImage("lorann_l.png");
				break;
	        case DOWNRIGHT:
				this.getCollider(posX +1, posY +1, Direction.DOWNRIGHT);
				this.hero.setImage("lorann_br.png");
	            break;
	        case DOWNLEFT:
				this.getCollider(posX -1, posY +1, Direction.DOWNLEFT);
				this.hero.setImage("lorann_bl.png");
	            break;
	        case UPRIGHT:
				this.getCollider(posX +1, posY -1, Direction.UPRIGHT);
				this.hero.setImage("lorann_ur.png");
	            break;
	        case UPLEFT:
				this.getCollider(posX -1, posY -1, Direction.UPLEFT);
				this.hero.setImage("lorann_ul.png");
	            break;
				
			/*case SHOOT:
				try
				{
					this.launchSpell();
				}
				
				catch (final IOException e)
				{
					e.printStackTrace();
				}
				break;*/
				
			case STATIC:
				default: this.hero.setImage("crystal_ball.png");
					break;
				
			}

	}
	public void getCollider(int x, int y, Direction direction)
	{
		
		Item item;
		item = this.LorannModel.getItemList()[y][x];
		
		switch(item.getColliderPermission())
		{
		case 0:  this.hero.setPosition(new Position(this.posX, this.posY)); break;
		case 1:  this.hero.setPosition(new Position (x,y)); 				break;
		case 2:  
			JFrame frame1 = new JFrame("Lorann - You Lost !");
	        frame1.setTitle("Lorann - You Lost !");
	        JOptionPane.showMessageDialog(frame1, "You Lost !", "Lorann - You Lost !", JOptionPane.PLAIN_MESSAGE);
	        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        System.exit(JFrame.EXIT_ON_CLOSE);
	        break;
		case 3:  this.hero.setPosition(new Position (x,y)); break;
		case 4:	
			item = new WALL_Void();
			this.LorannModel.setItemList(item, x, y);
			this.setSCORE(this.SCORE + 500);
			this.hero.setPosition(new Position (x,y));
			break;
			
		case 5:
			item = new WALL_Void();
			this.LorannModel.setItemList(item, x, y);
			this.setSCORE(this.SCORE + 500);
			this.hero.setPosition(new Position(x,y));
			Item door =  new WALL_Door();
			door.setImage("gate_open.png");
			door.setColliderPermission(6);
			this.LorannModel.setItemList(door,this.LorannModel.getDoorPosition().getX(), this.LorannModel.getDoorPosition().getY());
			break;
		case 6:
			this.hero.setPosition(new Position(x,y));
			JFrame frame2 = new JFrame("Lorann - You Won !");
	        frame2.setTitle("Lorann - You Won !");
	        JOptionPane.showMessageDialog(frame2, "You Won !", "Lorann - You Won !", JOptionPane.PLAIN_MESSAGE);
	        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        System.exit(JFrame.EXIT_ON_CLOSE);
			break;
			
		default: this.hero.setPosition(new Position(this.posX, this.posY));	break;
		}
		this.direction = direction;
		
	}

	public void play()
	{
		this.gameLoop();
		iView.displayMessage("Game Over!");
		iView.exit();
	}
	
	public void setViewSystem(final iView viewSystem)
	{
		this.viewSystem = viewSystem;
	}
	
	public iView getViewSystem()
	{
		return this.viewSystem;
	}
	
	
	/*private void launchSpell() throws IOException
	{
		
			
		{
			final Position position = new Position(
					this.hero.getPosition().getX() + ((this.width - this.spell.getWidthWithADirection(this.hero.getDirection())) / 2),
					hero.getPosition().getY() + ((this.height - this.spell.getHeightWithADirection(this.hero.getDirection())) / 2));
					
			this.LorannModel.addMobile(new MOVABLEITEM_Spell(this.hero.getDirection(), position));
					switch (hero.getDirection()) 
					{
						case UP:
							position.setY(position.getY() - 48 - this.hero.getSpeed());
							break;
							
						case RIGHT:
							position.setX(position.getX() + 48 + this.hero.getSpeed());
							break;
							
						case DOWN:
							position.setY(position.getY() + 48 + this.hero.getSpeed());
							break;
							
						case LEFT:
							position.setX(position.getX() - 48 - this.hero.getSpeed());
							break;
							
						default:
							break;

					}
		}
	}*/

	private void gameLoop()
	{
		while (!this.isGameOver)
		{
			try 
			{
				Thread.sleep(TIME_SLEEP);
			}
			
			catch (final InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
			final ArrayList<INTERFACE_Mobile> initialMobiles = new ArrayList<INTERFACE_Mobile>();
			for (final INTERFACE_Mobile mobile : this.LorannModel.getMobiles())
			{
				initialMobiles.add(mobile);
			}
			
			
			this.LorannModel.setMobilesHavedMove();
		}
	}
	
	public int getSCORE() {
		return SCORE;
	}

	public void setSCORE(int sCORE) {
		SCORE = sCORE;
	}

	
	
	
	// No warning with this
	public MonModele.Direction getDirection() {
		return direction;
	}


}
