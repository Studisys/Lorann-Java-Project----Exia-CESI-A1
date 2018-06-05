package MonModele;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LorannModelTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void test()
	{
		LorannModel test = new LorannModel();
		String stringTest = "AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH";
		test.setLevel("AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH");
		assertEquals("Les niveaux sont bien égaux", stringTest, test.getLevel());
	}
		

}
