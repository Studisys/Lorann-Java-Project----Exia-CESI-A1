package main;
/**
 * <h1>main JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import org.junit.Test;

import MonModele.Item;
import MonModele.LorannModel;
import monController.LorannController;

public class CollisionTest {
	
	/**Testing of the collision class which look on the map and return a move possibility or not depending on what type of item it is*/
	

	@Test
	public void testCollision() 
	{
		LorannModel lorannmodel = new LorannModel(); /**creating a new object to contain the level*/
		
		/**Initializing a String level with our map String*/
		String level = "AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH";
		lorannmodel.setLevel(level); /**assigning our String to the level of our Object*/
		lorannmodel.mapCreator(lorannmodel.getLevel()); /**creating map with all variables*/
		/**creation of a new object to recover item type depending on position*/
		LorannController loranncontroller = new LorannController(lorannmodel); 
		
		Item item; /**Object that will contain our map object*/
		item = loranncontroller.LorannModel.getItemList()[8][2]; /**tested position with y for first value and x for second*/
		switch(item.getColliderPermission())
		{
		case 0:  System.out.println("0");
		case 1:  System.out.println("1");
		case 2:  System.out.println("2");
		case 3:  System.out.println("3");
		case 4:  System.out.println("4");
		}	/**Returning item type depending of position*/
	}
}
