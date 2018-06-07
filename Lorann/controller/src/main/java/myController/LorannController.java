package myController;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import myModel.Direction;
import myModel.INTERFACE_Model;
import myModel.Item;
import myModel.MOVABLEITEM_MovableItem;
import myModel.Position;
import myModel.SPRITE_MeSprite;
import myModel.WALL_Door;
import myModel.WALL_Void;
import myView.iView;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class LorannController.</h1>
 * @author Nicolas DRAPIER
 * @version 0.1
 */
//A class called LorannController
public class LorannController implements iOrderPerformer, Runnable
{
	
	/** TIME SLEEP. */
	private int TIME_SLEEP = 30;
	
	/** SPEED. */
	private int speed = 200;
	
	/** LorannModel of type INTERFACE_Model. */
	public final INTERFACE_Model LorannModel;
	
	/** ISGAMEOVER BOOLEAN. */
	private boolean isGameOver = false;
	
	/** VIEWSYSTEM. */
	private iView viewSystem;
	
	/** HERO ITEM. */
	private Item hero;
	
	/** SCORE. */
	private int SCORE = 0;
	
	/** LAUNCHED BOOLEAN. */
	private boolean launched = false;
	
	/** POSITION POSX & POSY. */
	private int posX, posY;
	
	/** POSITION X & Y. */
	private int x,y;
	
	/** DIRECTION. */
	private myModel.Direction direction = null;
	
	/** SPELL ITEM. */
	private MOVABLEITEM_MovableItem spell;
	
	/**
	 * LorannController constructor.
	 *
	 * @param LorannModel the lorann model
	 */
	public LorannController(final INTERFACE_Model LorannModel) 
	{
		this.LorannModel = LorannModel;
		this.hero = this.LorannModel.getLorann();	
		this.spell = new MOVABLEITEM_MovableItem();
		this.spell.setImage("fireball_1.png");
		this.spell.setPosition(new Position(21,13)); //place out of the map
		this.LorannModel.getMonsterList().add(spell);
	}
	
	/**
	 * Gets the monster list.
	 *
	 * @return the monster list
	 */
	public ArrayList<MOVABLEITEM_MovableItem> getMonsterList()
	{
		return this.LorannModel.getMonsterList();
	}
	
	
	/**
	 * Checks if is launched.
	 *
	 * @return true, if is launched
	 */
	public boolean isLaunched() {
		return launched;
	}



	/**
	 * Sets the launched.
	 *
	 * @param launched the new launched
	 */
	public void setLaunched(boolean launched) {
		this.launched = launched;
	}

	

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}



	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}



	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}



	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 *  Key manager
	 * Perform action on user Keyboard Input
	 * - Set new position on array (x, y) and change sprite.
	 *
	 * @param keyOrder the key order
	 */
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
				
			}System.out.println(this.getSCORE());
	}
	
	/**
	 * Collision manager for spell .
	 *
	 * @param x the x
	 * @param y the y
	 */
	
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
	
	/**
	 *  launch spell 
	 * x = theorical position
	 * y = theorical position
	 * direction = arrow direction.
	 *
	 * @param x the x
	 * @param y the y
	 * @param direction the direction
	 */
	
	/**
	 * @param x
	 * @param y
	 * @param direction
	 */
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
	
	/**
	 *  Collision manager for Lorann 
	 * x = lorann's X
	 * y = lorann's Y
	 * direction is the arrow direction.
	 *
	 * @param x the x
	 * @param y the y
	 * @param direction the direction
	 * @return the collider
	 */
	
	
	/**
	 * @param x
	 * @param y
	 * @param direction
	 */
	public void getCollider(int x, int y, Direction direction)
	{
		
		Item item;
		item = this.LorannModel.getItemList()[y][x];
		
		for(int i = 0; i<=this.LorannModel.getMonsterList().size()-1;i++)
		{
			this.hero.setPosition(new Position(x,y));
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
				/** If its void, nothing */
				case 0:  this.hero.setPosition(new Position(this.posX, this.posY)); break;
				case 1:  this.hero.setPosition(new Position (x,y)); 				break;
				/** If its something that can kill, like a monster or a closed door */
				case 2:  
					JFrame frame1 = new JFrame("Lorann - You Lost !");
			        frame1.setTitle("Lorann - You Lost !");
			        JOptionPane.showMessageDialog(frame1, "You Lost !", "Lorann - You Lost !", JOptionPane.PLAIN_MESSAGE);
			        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        System.exit(JFrame.EXIT_ON_CLOSE);
			        break;
				case 3:  this.hero.setPosition(new Position (x,y)); break;
				/** If it's a purse*/
				case 4:	
					item = new WALL_Void();
					this.LorannModel.setItemList(item, x, y);
					this.setSCORE(this.SCORE + 500);
					this.hero.setPosition(new Position (x,y));
					break;
					/** If its a crystal ball*/
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
					/** If its the open door */
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

	/**
	 * Play.
	 */
	public void play()
	{
		this.gameLoop();
		iView.displayMessage("Game Over!");
		iView.exit();
	}
	
	/**
	 * Sets the view system.
	 *
	 * @param viewSystem the new view system
	 */
	public void setViewSystem(final iView viewSystem)
	{
		this.viewSystem = viewSystem;
	}
	
	/**
	 * Gets the view system.
	 *
	 * @return the view system
	 */
	public iView getViewSystem()
	{
		return this.viewSystem;
	}

	/**
	 * Game loop.
	 */
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
	
	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public int getSCORE() {
		return SCORE;
	}

	/**
	 * Sets the score.
	 *
	 * @param sCORE the new score
	 */
	public void setSCORE(int sCORE) {
		SCORE = sCORE;
	}

	/**
	 *  Thread and change the sprite of the hero .
	 */
	
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
	
	/**
	 *  change direction of a monster or the spell
	 * 
	 * not used yet.
	 *
	 * @param direction the direction
	 * @return the direction
	 */
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
	
	/**
	 * Collision method for monsters
	 * x = monster's X
	 * y = monster's Y.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the collider monster
	 */
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
	
	/**
	 * Get direction from model.
	 *
	 * @return the direction
	 */
	public myModel.Direction getDirection() {
		return direction;
	}


}
