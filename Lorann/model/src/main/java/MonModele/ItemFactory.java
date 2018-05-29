package MonModele;

public class ItemFactory {

	private char changer;
	private Item item;
	private Position position;
	
	public ItemFactory(char changer, Position position)
	{
		this.changer = changer;
		this.position = position;
	}
	
	public Item createItem(int changer)
	{
		
		switch (changer)
		{
		case 'W':
			this.item = new Purse(this.position);
			break;
		case 'B':
			this.item = new SuperBall(this.position);
			break;
			
		case 'X':
			this.item = new BoneWall(this.position);
			break;
			
		case 'A':
			this.item = new Pillar(this.position);
			break;
		case 'H':
			this.item = new Door(this.position);
			
		default:
			return null;
		}

		return item;
	}
	
	
}
