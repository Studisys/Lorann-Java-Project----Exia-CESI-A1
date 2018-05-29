package monController;

import java.io.IOException;

import com.sun.javafx.scene.traversal.Direction;

//A class called LorannController
public class LorannController implements iOrderPerformer
{
	private int TIME_SLEEP = 30;
	
	public LorannController(final iModel LorannModel) 
	{
		this.LorannModel = LorannModel;
	}
	
	public void orderPerform(KeyOrder keyOrder) 
	{
		if (Me !=null)
		{
			Direction direction;
			switch (keyOrder.getOrder())
			{
			case UP:
			direction = Direction.UP;
			break;
			
			case DOWN:
			direction = Direction.DOWN;
			break;
			
			case RIGHT:
			direction = Direction.RIGHT;
			break;
			
			case LEFT:
			direction = Direction.LEFT;
			break;
			
			case SHOOT:
				try
				{
					this.launchSpell();
				}
				
				catch (final IOException e)
				{
					e.printStackTrace();
				}
			}
			
			Me.setDirection(direction);
		}
	}
	
	public void play()
	{
		this.gameLoop();
		this.viewSystem.displayMessage("Game Over!");
		this.viewSystem.closeAll();
	}
	
	public void setViewSystem(final iView viewSystem)
	{
		this.viewSystem = viewSystem;
	}
	
	private void launchSpell() throws IOException
	{
		if (Me != null)
		{
			final Position position = new Position(Me.getPosition().getX() + ((Me.getWidth() - Spell.getWidthWithADirection(Me.getDirection())) / 2),
					Me.getPosition().getY() + ((Me.getHeight() - Spell.getHeightWithADirection(Me.getDirection())) / 2));
					this.LorannModel.addMobile(new Spell(Me.getDirection(), position));
					switch (Me.getDirection()) 
					{
						case UP:
						position.setY(position.getY() - Me.getHeight() - Me.getSpeed());
						break;
							
						case RIGHT:
						position.setX(position.getX() + Me.getWidth() + Me.getSpeed());
						break;
							
						case DOWN:
						position.setY(position.getY() + Me.getHeight() + Me.getSpeed());
						break;
							
						case LEFT:
						position.setX(position.getX() - Me.getWidth() - Me.getSpeed());
						break;
							
						default:
						break;
					}
		}
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
			
			final ArrayList<iMobile> initialMobiles = new ArrayList<iMobile>();
			for (final iMobile mobile : this.LorannModel.getMobiles())
			{
				initialMobiles.add(mobile);
			}
			
			for (final iMobile mobile : initialMobiles)
			{
				mobile.move();
				if (mobile.isWeapon())
				{
					this.manageCollision(mobile);
				}
			}
			
			this.LorannModel.setMobilesHavesMoved();
		}
	}
}
