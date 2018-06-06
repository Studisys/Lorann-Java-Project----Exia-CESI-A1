package MonModele;
/**
 * <h1>CollisionTest JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*testing the setLevel method in comparison of a String*/
public class LorannModelTest {
	@Test
	public void test()
	{
		LorannModel test = new LorannModel();  /**creating the LorannModel object which will store our level*/
		/**Storing our level in a String*/
		String stringTest = "AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH";
		/**setting our level using the setLevel methode on test object*/
		test.setLevel("AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH");
		assertEquals("Les niveaux sont bien égaux", stringTest, test.getLevel());/*testing equality between both variable and object*/
	}
		

}
