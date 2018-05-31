package monController;

import java.io.IOException;
import java.util.ArrayList;

import com.sun.javafx.scene.traversal.Direction;

import MonModele.INTERFACE_Mobile;
import MonModele.INTERFACE_Model;
import MonModele.MOVABLEITEM_Me;
import MonModele.MOVABLEITEM_Spell;
import MonModele.Position;
import maVue.iView;

//A class called LorannController
public class LorannController implements iOrderPerformer
{
	private int TIME_SLEEP = 30;
	private final INTERFACE_Model LorannModel;
	private boolean isGameOver = false;
	private iView viewSystem;
	final INTERFACE_Mobile hero = this.LorannModel.getMobiles();
	
	public LorannController(final INTERFACE_Model LorannModel) 
	{
		this.LorannModel = LorannModel;
	}
	
	@Override
	public void orderPerform(iKeyOrder keyOrder) 
	{
		
		if (hero !=null)
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
			
			MOVABLEITEM_Me.setDirection(direction);
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
	
	private void launchSpell() throws IOException
	{
		if (hero != null)
		{
			final Position position = new Position(hero.getPosition().getX() + ((MOVABLEITEM_Me.getWidth() - MOVABLEITEM_Spell.getWidthWithADirection(MOVABLEITEM_Me.getDirection())) / 2),
					hero.getPosition().getY() + ((MOVABLEITEM_Me.getHeight() - MOVABLEITEM_Spell.getHeightWithADirection(MOVABLEITEM_Me.getDirection())) / 2));
					this.LorannModel.addMobile(new MOVABLEITEM_Spell(MOVABLEITEM_Me.getDirection(), position));
					switch (hero.getDirection()) 
					{
						case UP:
							position.setY(position.getY() - MOVABLEITEM_Me.getHeight() - MOVABLEITEM_Me.getSpeed());
							break;
							
						case RIGHT:
							position.setX(position.getX() + MOVABLEITEM_Me.getWidth() + MOVABLEITEM_Me.getSpeed());
							break;
							
						case DOWN:
							position.setY(position.getY() + MOVABLEITEM_Me.getHeight() + MOVABLEITEM_Me.getSpeed());
							break;
							
						case LEFT:
							position.setX(position.getX() - MOVABLEITEM_Me.getWidth() - MOVABLEITEM_Me.getSpeed());
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
			
			final ArrayList<INTERFACE_Mobile> initialMobiles = new ArrayList<INTERFACE_Mobile>();
			for (final INTERFACE_Mobile mobile : this.LorannModel.getMobiles())
			{
				initialMobiles.add(mobile);
			}
			
			for (final INTERFACE_Mobile mobile : initialMobiles)
			{
				mobile.move();
				if (((MOVABLEITEM_Me) mobile).isWeapon())
				{
					this.manageCollision(mobile);
				}
			}
			
			this.LorannModel.setMobilesHavedMove();
		}
	}
}
