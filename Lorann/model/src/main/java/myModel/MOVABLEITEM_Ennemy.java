package myModel;
// TODO: Auto-generated Javadoc

/**
 * <h1>The Abstract Class MOVABLEITEM_Ennemy</h1>
 * 	Ennemy thread, with Artificial Intelligence (not working and in comments because repaint fails) and collision manager (same as AI).
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see MOVABLEITEM_MovableItem
 */
public class MOVABLEITEM_Ennemy extends MOVABLEITEM_MovableItem implements Runnable {

	
	/**
	 * Instantiates a new MOVABLEITE M ennemy.
	 *
	 * @param direction the direction
	 * @param position the position
	 * @param image the image
	 */
	public MOVABLEITEM_Ennemy(Direction direction, Position position, String image) 
	{
		
	}
	
	/**
	 * Instantiates a new MOVABLEITE M ennemy.
	 */
	public MOVABLEITEM_Ennemy()
	{
		
	}
	
	/**
	 * Checks if is alive.
	 */
	public void isAlive()
	{
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	/** Run method for ennemies thread*/
	public void run()
	{
		while(true)
		{
			for(int i = 0; i<7; i++)
			{
				System.out.println(Thread.currentThread().getName() + " ennemy" + Thread.currentThread().getState());
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	

	/**
	 *  Set direction for Monsters - IA part.
	 *
	 * @param monstre the monstre
	 * @param player the player
	 * @return the direction through player
	 */
	public Direction getDirectionThroughPlayer(MOVABLEITEM_MovableItem monstre, Item player)
	{
	
		if(monstre.getPosition().getX()>player.getPosition().getX() && monstre.getPosition().getY()>player.getPosition().getY())
		{
			return Direction.UPLEFT;
		}
		if(monstre.getPosition().getX()==player.getPosition().getX() && monstre.getPosition().getY()>player.getPosition().getY())
		{
			return Direction.UP;
		}
		if(monstre.getPosition().getX()<player.getPosition().getX() && monstre.getPosition().getY()>player.getPosition().getY())
		{
			return Direction.UPRIGHT;
		}
		if(monstre.getPosition().getX()<player.getPosition().getX() && monstre.getPosition().getY()==player.getPosition().getY())
		{
			return Direction.RIGHT;
		}
		if(monstre.getPosition().getX()<player.getPosition().getX() && monstre.getPosition().getY()<player.getPosition().getY())
		{
			return Direction.DOWNRIGHT;
		}
		if(monstre.getPosition().getX()==player.getPosition().getX() && monstre.getPosition().getY()<player.getPosition().getY())
		{
			return Direction.DOWN;
		}
		if(monstre.getPosition().getX()>player.getPosition().getX() && monstre.getPosition().getY()<player.getPosition().getY())
		{
			return Direction.DOWNLEFT;
		}
		if(monstre.getPosition().getX()>player.getPosition().getX() && monstre.getPosition().getY()==player.getPosition().getY())
		{
			return Direction.LEFT;
		}
		return Direction.STATIC;
		
	}
	
	/**
	 *  Returns current position.
	 *
	 * @param position the position
	 * @param direction the direction
	 * @return the position T
	 */
	public Position getPositionT(Position position, Direction direction)
	{
		
		switch(direction)
		{
		case UP: position.setY(position.getY()-1);break;
		case DOWN: position.setY(position.getY()+1);break;
		case LEFT: position.setX(position.getX()-1);break;
		case RIGHT: position.setX(position.getX()+1);break;
		case UPRIGHT: position.setY(position.getY()-1);position.setX(position.getX()+1);break;
		case UPLEFT:position.setY(position.getY()-1);position.setX(position.getX()-1);break;
		case DOWNRIGHT:position.setY(position.getY()+1);position.setX(position.getX()+1);break;
		case DOWNLEFT:position.setY(position.getY()+1);position.setX(position.getX()-1);break;
		default: return null;
		}
		return position;
	}
	
	
	/**
	 * Change dir.
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
	/** FInal getColliderMonster not implemented because of repaint*/
	/*
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

	}*/
	/** This is the not working Artificial Intelligence because the repaint was not working. It allows to move the monsters 
	 * 
	 * depending on Lorann position */
	/*
	public void myIa(MOVABLEITEM_Ennemy monster, int x, int y)
	{
		
		if(this.getColliderMonster(monster.getPositionT(monster.getPosition(), monster.getDirection()).getX(), monster.getPositionT(monster.getPosition(), monster.getDirection()).getY()))
		{
			if(this.getColliderMonster(
					monster.getPositionT(monster.getPosition(), monster.getDirectionThroughPlayer(monster, this.hero)
							).getX(), 
					monster.getPositionT(monster.getPosition(), monster.getDirectionThroughPlayer(monster, this.hero)
							).getY()))
			{
				monster.setDirection(monster.changeDir(monster.getDirection()));
				this.myIa(monster, monster.getPosition().getX(), monster.getPosition().getY());
			}
			else //go to player position
			{
				monster.setPosition(monster.getPositionT(monster.getPosition(), monster.getDirectionThroughPlayer(monster, this.hero)));
			}
		}
		else
		{
			monster.setPosition(monster.getPositionT(monster.getPosition(), monster.getDirectionThroughPlayer(monster, this.hero)));
		}
	}*/
	
}
