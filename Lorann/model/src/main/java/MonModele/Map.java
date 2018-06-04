package MonModele;

import java.util.ArrayList;

/**********************************************************************************
**																				 **
**							  		Class Map								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/

public class Map {
	
	private String level;
	private char[] cast;
	public char[][] map2D;
	protected ArrayList<Item>[][] listItem;
	private int row = 12, columm = 20;
	
	private FACTORY_FactoryStaticItem factory;

	public Map()
	{
		this.factory = new FACTORY_FactoryStaticItem();
		this.map2D = new char[this.row][this.columm];
		this.listItem = new ArrayList[this.row][this.columm];
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
		int h = 0;
		for (int i = 0; i<=this.row - 1; i++)
		{
			for (int j=0; j<=this.columm - 1; j++)
			{
				this.listItem[i][j] = new ArrayList();
				this.listItem[i][j].add(this.factory.createItem(this.cast[h]));
				h++;
			}
			
		}
		
		int z = 0;
		for (int i = 0; i<=this.row - 1; i++)
		{
			for (int j=0; j<=this.columm - 1; j++)
			{
				this.map2D[i][j] = this.cast[z];
				z++;
				System.out.print(this.map2D[i][j] + "   ");	
			}
			System.out.println("");
		}
		System.out.println("---------------------------------------------");
		/*for (int i = 0; i<=this.listItem.size()-1;i++)
		{
			System.out.println(this.listItem.get(i).toString());
		}*/
	
		
	}
}
