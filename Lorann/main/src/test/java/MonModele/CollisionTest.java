package MonModele;

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
		LorannModel lorannmodel = new LorannModel();
		String level = "AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH";
		lorannmodel.setLevel(level);
		lorannmodel.mapCreator(lorannmodel.getLevel());
		LorannController loranncontroller = new LorannController(lorannmodel);
		
		Item item;
		item = loranncontroller.LorannModel.getItemList()[8][2]; //tested position with y for first value and x for second
		switch(item.getColliderPermission())
		{
		case 0:  System.out.println("0");
		case 1:  System.out.println("1");
		case 2:  System.out.println("2");
		case 3:  System.out.println("3");
		case 4:  System.out.println("4");
		default: System.out.println("default");
		}	
	}
}
