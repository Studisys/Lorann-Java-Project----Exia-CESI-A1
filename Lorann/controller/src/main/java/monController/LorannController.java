package monController;

import java.io.IOException;
import java.util.ArrayList;

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
	private MOVABLEITEM_Me hero;
	private MOVABLEITEM_Spell spell;
	//final INTERFACE_Mobile hero = this.LorannModel.getMobiles();
	private int width =20, height = 12;
	
	public LorannController(final INTERFACE_Model LorannModel) 
	{
		this.LorannModel = LorannModel;
		this.hero = new MOVABLEITEM_Me();
	}
	
	@Override
	public void orderPerform(iKeyOrder keyOrder) 
	{
		
		if (hero !=null)
		{
			MonModele.Direction direction = null;
			switch (keyOrder.getOrder())
			{
			case UP:
				direction = MonModele.Direction.UP;
				break;
			
			case DOWN:
				direction = MonModele.Direction.DOWN;
				break;
			
			case RIGHT:
				direction = MonModele.Direction.RIGHT;
				break;
			
			case LEFT:
				direction = MonModele.Direction.LEFT;
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
			
			this.hero.setDirection(direction);
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
	
	private void launchSpell() throws IOException
	{
		if (hero != null)
			
		{
			final Position position = new Position(this.hero.getPosition().getX() + ((this.width - this.spell.getWidthWithADirection(this.hero.getDirection())) / 2),
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
