package MonModele;

public class ItemFactory {

	//private Item item;
	
	public ItemFactory()
	{
		
	}
	
	public Item createItem(char changer)
	{		
		switch (changer)
		{
		case 'W':
			return new Purse();
		
			
		case 'B':
			return new SuperBall();
			
			
		case 'J':
			return new BoneWallH();
			
		
		case 'X':
			return new BoneWallY();
			
			
		case 'A':
			return new Pillar();
			
			
		case 'H':
			return new Door();
			
		case 'Y':
			return new Void();
			
		default:
			return new Void();
		}
	}
	
	
}
