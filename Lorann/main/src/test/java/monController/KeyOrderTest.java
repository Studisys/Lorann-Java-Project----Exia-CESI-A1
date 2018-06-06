package monController;
/**
 * <h1>KeyOrder JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import org.junit.Test;

public class KeyOrderTest {

/**Test to try the KeyOrder class by creating a new KeyOrder object and displaying its order*/
	@Test
	public void getOrder() 
	{
		@SuppressWarnings("unused")
		Order testorder = null;
		KeyOrder testOrder = new KeyOrder(Order.LEFT);
		testOrder.getOrder();
	}
}
