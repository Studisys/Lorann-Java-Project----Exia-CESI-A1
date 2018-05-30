package MonModele;

public class Map {

	private int width = 20, height = 12;
	
	private String level;
	private char[] cast;
	private char[][] d2cast;
	protected Item[] itemArray;
	
	private int row = 12, columm = 20;
	
	private FACTORY_FactoryStaticItem factory;

	public Map()
	{
		this.factory = new FACTORY_FactoryStaticItem();
		this.itemArray = new Item[this.row * this.columm];
		this.d2cast = new char[this.row][this.columm];
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
	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumm() {
		return columm;
	}


	public void setColumm(int columm) {
		this.columm = columm;
	}

	public void buildMap(String level)
	{
		this.setLevel(level);
		
		for(int i =0; i<=this.itemArray.length - 1;i++)
		{
			this.itemArray[i] = this.factory.createItem(this.cast[i]);
		}
		
		int h = 0;
		for (int i = 0; i<=this.row - 1; i++)
		{
			for (int j=0; j<=this.columm - 1; j++)
			{
				this.d2cast[i][j] = this.cast[h];
				h++;
				System.out.print(this.d2cast[i][j] + "   ");	
			}
			System.out.println("");
		}
		
	}
}
