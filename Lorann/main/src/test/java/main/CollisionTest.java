package main;
/**
 * <h1>main JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import org.junit.Test;

import myModel.Item;
import myModel.LorannModel;
import myController.LorannController;

// TODO: Auto-generated Javadoc
/**
 * The Class CollisionTest.
 */
public class CollisionTest {
	
	/**
	 * Testing of the collision class which look on the map and return a move possibility or not depending on what type of item it is.
	 */
	

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
		item = loranncontroller.LorannModel.getItemList()[0][0]; /**tested position with y for first value and x for second*/
		switch(item.getColliderPermission())
		{
		case 0:  System.out.println("0"); break;
		case 1:  System.out.println("1");break;
		case 2:  System.out.println("2");break;
		case 3:  System.out.println("3");break;
		case 4:  System.out.println("4");break;
		}	/**Returning item type depending of position*/
	}
}
