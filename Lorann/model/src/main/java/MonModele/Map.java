package MonModele;

public class Map {

	private int width = 20, height = 12;
	
	private String level;
	private char[] cast;
	protected Item[] itemArray;
	
	private FACTORY_FactoryStaticItem factory;

	public Map()
	{
		this.factory = new FACTORY_FactoryStaticItem();
		this.itemArray = new Item[240];
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
		
		for(int i =0; i<=this.itemArray.length - 1;i++)
		{
			this.itemArray[i] = this.factory.createItem(this.cast[i]);
		}
		
	}
}
