package myModel;
/**
 * <h1>CollisionTest JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import myController.LorannController;
import myModel.Item;
import myModel.LorannModel;

// TODO: Auto-generated Javadoc
/**
 * The Class CollisionTest.
 */
public class CollisionTest {

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test collision.
	 */
	@Test
	public void testCollision() 
	{
		LorannModel lorannmodel = new LorannModel(); /**create a new object which will contain our map*/
		/**Storing the String in a variable in order to set it in our map object*/
		String level = "AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH";
		lorannmodel.setLevel(level); /**implementing the map in our object*/
		lorannmodel.mapCreator(lorannmodel.getLevel());
		LorannController loranncontroller = new LorannController(lorannmodel);/**creating a controller which contain our map for collision*/
		
		Item item;
		/** tested position with y for first value and x for second*/
		item = loranncontroller.LorannModel.getItemList()[8][2];
		switch(item.getColliderPermission())
		{
		case 0:  System.out.println("false");
		case 1:  System.out.println("false");
		case 2:  System.out.println("false");
		case 3:  System.out.println("true");
		case 4:  System.out.println("false");
		case 5: System.out.println("false");
		}	
		/*returning the possibility or not to move on this position*/
	}
}
