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
	protected Item[][] listItem;
	protected ArrayList<Item> listMonster;
	private int row = 12, columm = 20;
	
	private int width = 48, height = 48;
	
	private FACTORY_FactoryStaticItem factory;

	public Map()
	{
		this.factory = new FACTORY_FactoryStaticItem();
		this.map2D = new char[this.row][this.columm];
		this.listItem = new Item[this.row][this.columm];
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
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void buildMap(String level)
	{
		this.setLevel(level);
		
		int h = 0;
		for (int y = 0; y<=this.row - 1; y++)
		{
			for (int x=0; x<=this.columm - 1; x++)
			{
				this.listItem[y][x] = this.factory.createItem(this.cast[h], x, y);
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
		
		for (int i = 0; i<=this.row - 1; i++)
		{
			for (int j=0; j<=this.columm - 1; j++)
			{
				System.out.println(this.listItem[i][j].toString());
			}
		}
		
		this.listMonster = this.factory.movable;
		
		
	}
}
