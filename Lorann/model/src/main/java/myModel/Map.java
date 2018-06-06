package myModel;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class Map</h1>
 * Inserts items in the map.
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 */

public class Map {
	
	/** The level. */
	private String level;
	
	/** The cast. */
	private char[] cast;
	
	/** The map 2 D. */
	protected char[][] map2D;
	
	/** The list item. */
	private Item[][] listItem;
	
	/** The list monster. */
	private ArrayList<MOVABLEITEM_MovableItem> listMonster;
	
	/** The lorann. */
	private Item lorann;

	/** The columm. */
	private int row = 12, columm = 20;
	
	/** The height. */
	private int width = 48, height = 48;
	
	/** The factory. */
	private FACTORY_FactoryStaticItem factory;

	/**
	 * Instantiates a new map.
	 */
	public Map()
	{
		this.factory = new FACTORY_FactoryStaticItem();
		this.map2D = new char[this.row][this.columm];
		this.listItem = new Item[this.row][this.columm];
	}
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	
	/**
	 *  Processing the string from MySQL.
	 *
	 * @param level the new level
	 */
	public void setLevel(String level) {
		this.level = level;
		this.cast = level.toCharArray();
	}
	
	/**
	 * Gets the row.
	 *
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Sets the row.
	 *
	 * @param row the new row
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * Gets the columm.
	 *
	 * @return the columm
	 */
	public int getColumm() {
		return columm;
	}

	/**
	 * Sets the columm.
	 *
	 * @param columm the new columm
	 */
	public void setColumm(int columm) {
		this.columm = columm;
	}
	

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Buildmap : transform a string to a 2D Item Array.
	 *
	 * @param level the level
	 */
	
	
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
				if(this.map2D[i][j] == 'K')
					this.map2D[i][j] = 'Y';
				z++;
			}
		}
		
		this.listMonster = this.factory.getMovable();
		this.lorann = this.factory.getLorann();
		
		
	}

	/**
	 * Gets the list item.
	 *
	 * @return the list item
	 */
	public Item[][] getListItem() {
		return listItem;
	}

	/**
	 * Gets the list monster.
	 *
	 * @return the list monster
	 */
	public ArrayList<MOVABLEITEM_MovableItem> getListMonster() {
		return listMonster;
	}
	
	/**
	 * Gets the lorann.
	 *
	 * @return the lorann
	 */
	public Item getLorann() {
		return lorann;
	}
	
	/**
	 * Gets the door position.
	 *
	 * @return the door position
	 */
	public Position getDoorPosition()
	{
		return this.factory.getDoorPosition();
	}
}
