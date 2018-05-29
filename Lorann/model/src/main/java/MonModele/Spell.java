package MonModele;

public class Spell extends Movable {

	
	private int speed;
	private int maxDistanceTraveled;
	private int distanceTraveled;
	private String image;
	
	public Spell(Direction direction)
	{
		
	}
	
	public int getWidthWithADirection()
	{
		return 0;
	}
	
	public int getHeightWithADirection()
	{
		return 0;
	}
	
	public void launch()
	{
			for(int i = 0; i<8;i++)
			{
				this.image = "/images/" + SpellSprite.values()[i].toString();
				this.setImage(this.image);
			}
	}
	
}
