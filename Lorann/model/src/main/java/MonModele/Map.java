package MonModele;

public class Map {

	private int width = 20, height = 12;
	
	private String level;
	private char[] cast;
	private char[][] map = null;
	
	private ItemFactory factory;
	private Position position;
	
	public Map()
	{
		this.factory = new ItemFactory();
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
	}

	public int[][] buildMap()
	{
		int z = 0;
		this.cast = level.toCharArray();
		
			for(int i = 0; i<=this.getWidth()-1;i++)
			{
				for(int j = 0; j<=this.getHeight()-1;j++)
				{
					this.position.setX(i);
					this.position.setY(j);
					
					this.map[i][j] = this.cast[z];
					this.factory.createItem(this.map[i][j], this.position);
					z++;
				}
			}
		
		
		return null;
		
	}
}
