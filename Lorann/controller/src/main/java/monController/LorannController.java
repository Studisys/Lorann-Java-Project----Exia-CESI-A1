package monController;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MonModele.Direction;
import MonModele.INTERFACE_Model;
import MonModele.Item;
import MonModele.MOVABLEITEM_MovableItem;
import MonModele.Position;
import MonModele.SPRITE_MeSprite;
import MonModele.WALL_Door;
import MonModele.WALL_Void;
import maVue.iView;

/**
 * <h1>The Class LorannController.</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */
//A class called LorannController
public class LorannController implements iOrderPerformer, Runnable
{
	private int TIME_SLEEP = 30;
	private int speed = 200;
	public final INTERFACE_Model LorannModel;
	private boolean isGameOver = false;
	private iView viewSystem;
	private Item hero;
	private int SCORE = 0;

	private boolean launched = false;
	private int posX, posY;
	private int x,y;
	
	private MonModele.Direction direction = null;
	
	private MOVABLEITEM_MovableItem spell;
	
	
	public LorannController(final INTERFACE_Model LorannModel) 
	{
		this.LorannModel = LorannModel;
		this.hero = this.LorannModel.getLorann();	
		this.spell = new MOVABLEITEM_MovableItem();
		this.spell.setImage("fireball_1.png");
		this.spell.setPosition(new Position(21,13));
		this.LorannModel.getMonsterList().add(spell);
	}
	
	public ArrayList<MOVABLEITEM_MovableItem> getMonsterList()
	{
		return this.LorannModel.getMonsterList();
	}
	
	
	public boolean isLaunched() {
		return launched;
	}



	public void setLaunched(boolean launched) {
		this.launched = launched;
	}

	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
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
				
			case SHOOT:
				this.launchSpell(posX, posY, this.getDirection());
				this.spell.setImage("fireball_1.png");
				break;
				
			case STATIC:
				default: this.hero.setImage("lorann_l.png");
					break;
				
			}
	}
	
	private void collision(int x, int y)
	{
		for(int i = 0; i<=this.LorannModel.getMonsterList().size()-1;i++)
		{
			if (x == this.LorannModel.getMonsterList().get(i).getPosition().getX() && y == this.LorannModel.getMonsterList().get(i).getPosition().getY())
			{
				this.LorannModel.getMonsterList().remove(i);
				this.setSCORE(this.getSCORE()+1000);
				spell.setPosition(new Position(x,y));
				spell.setImage("fireball_1.png");
			}
		}
	}
	
	
	
	private void launchSpell(int x, int y, Direction direction)
	{
		
		
		switch(direction)
		{
		
		case UP: 
		this.collision(x, y-1);
		break;
	
		case DOWN: 	
		this.collision(x, y+1);
		break;
		
		case RIGHT: 
		this.collision(x+1, y);
		break;
		
		case LEFT: 		
		this.collision(x-1, y);
		break;
		
		default:
		this.spell.setImage("fireball_1.png");
		break;
		}
		this.spell.setImage("fireball_1.png");
	}
	
	public void getCollider(int x, int y, Direction direction)
	{
		
		Item item;
		item = this.LorannModel.getItemList()[y][x];
		
		for(int i = 0; i<=this.LorannModel.getMonsterList().size()-1;i++)
		{
			if (x == this.LorannModel.getMonsterList().get(i).getPosition().getX() && y == this.LorannModel.getMonsterList().get(i).getPosition().getY())
			{
				JFrame frame1 = new JFrame("Lorann - You Lost !");
		        frame1.setTitle("Lorann - You Lost !");
		        JOptionPane.showMessageDialog(frame1, "You Lost !", "Lorann - You Lost !", JOptionPane.PLAIN_MESSAGE);
		        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        System.exit(JFrame.EXIT_ON_CLOSE);
			}
			else
			{
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
		}
		
		
		
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

			this.LorannModel.setMobilesHavedMove();
		}
	}
	
	public int getSCORE() {
		return SCORE;
	}

	public void setSCORE(int sCORE) {
		SCORE = sCORE;
	}

	@Override
	public void run() 
	{
		while(true)
		{
			for(int i = 0; i<8; i++)
			{
				this.hero.setImage(SPRITE_MeSprite.values()[i] + ".png");
				try {
					Thread.sleep(this.speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public Direction changeDir(Direction direction)
	{
		
		Direction tabIn[] = {Direction.UP, Direction.UPRIGHT, Direction.RIGHT, Direction.DOWNRIGHT, Direction.DOWN, Direction.DOWNLEFT, Direction.LEFT, Direction.UPLEFT};
		Direction tabOut[] = {Direction.UPRIGHT, Direction.RIGHT, Direction.DOWNRIGHT, Direction.DOWN, Direction.DOWNLEFT, Direction.LEFT, Direction.UPLEFT, Direction.UP};
		
		Direction myDir = null;
		for(int i = 0; i<=7; i++)
		{
			if(direction == tabIn[i])
			{
				myDir = tabOut[i];
			}
		}
		return myDir;
	}
	
	public boolean getColliderMonster(int x, int y)
	{
		
		Item item;
		item = this.LorannModel.getItemList()[y][x];
				
		switch(item.getColliderPermission())
		{
		case 0:  return true;
		case 1:  return false;
		case 2:  return true;
		case 3:  return true;
		case 4:  return true;
		default: return false;
		}

	}
	
	// No warning with this
	public MonModele.Direction getDirection() {
		return direction;
	}


}
