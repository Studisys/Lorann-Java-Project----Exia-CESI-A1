package monController;

/**
 * <h1>The Class KeyOrder</h1>
 *
 * @author Nicolas DRAPIER
 * @version 0.1
 * @see iKeyOrder
 */

//A class called KeyOrder
public class KeyOrder implements iKeyOrder
{	
	Order order;
	
	public KeyOrder(Order order)
	{
		this.order = order;
	}
	
	public Order getOrder()
	{
		return this.order;
	}
}
