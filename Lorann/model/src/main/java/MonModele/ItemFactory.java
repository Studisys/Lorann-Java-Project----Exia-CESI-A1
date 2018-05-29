package MonModele;

public class ItemFactory {

	private Item item;
	
	public ItemFactory()
	{
		
	}
	
	public Item createItem(char changer, Position position)
	{		
		switch (changer)
		{
		case 'W':
			this.item = new Purse(position);
			break;
		case 'B':
			this.item = new SuperBall(position);
			break;
			
		case 'X':
			this.item = new BoneWallH(position);
			break;
			
		case 'A':
			this.item = new Pillar(position);
			break;
		case 'H':
			this.item = new Door(position);
			
		default:
			return null;
		}

		return item;
	}
	
	
}
