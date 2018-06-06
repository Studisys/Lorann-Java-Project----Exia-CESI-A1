package MonModele;
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

import monController.LorannController;

public class CollisionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

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
		item = loranncontroller.LorannModel.getItemList()[8][2]; //tested position with y for first value and x for second
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
