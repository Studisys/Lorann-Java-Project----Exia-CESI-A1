package MonModele;

public class Map {

	private int width = 20, height = 12;
	
	private String level;
	private char[] cast;
	private Item[][] itemArray;
	
	private ItemFactory factory;
	private Position position;
	
	public Map()
	{
		this.factory = new ItemFactory();
		this.itemArray = new Item[20][12];
	}
	
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
		this.cast = level.toCharArray();
	}

	public void buildMap(String level)
	{
		this.setLevel(level);
		
		for(int i =0; i<19;i++)
		{
			for (int j=0; j<=11;j++)
			{
				this.itemArray[i][j] = this.factory.createItem(this.cast[i]);
			}
			
		}
		
	}
}
