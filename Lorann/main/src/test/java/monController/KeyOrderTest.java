package monController;

import org.junit.Test;

public class KeyOrderTest {


	@Test
	public void getOrder() 
	{
		@SuppressWarnings("unused")
		Order testorder = null;
		KeyOrder testOrder = new KeyOrder(Order.LEFT);
		testOrder.getOrder();
	}
}
