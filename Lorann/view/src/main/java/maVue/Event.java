package maVue;


/**
 * <h1>The Class Event n</h1>
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 * @see iEventPerformer
 */

import java.awt.event.KeyEvent;

import monController.KeyOrder;
import monController.Order;
import monController.iKeyOrder;
import monController.iOrderPerformer;

public class Event implements iEventPerformer{
	private final iOrderPerformer orderPerformer;

	public Event(iOrderPerformer eventPerformer)
	{
		this.orderPerformer = eventPerformer;
	}
	
	@Override
	public void event(final KeyEvent keyCode) 
	{
		final iKeyOrder keyOrder = this.getKeyCode(keyCode.getKeyCode());
		if (keyOrder != null) {
			this.orderPerformer.orderPerform(keyOrder);
		}
	}
	public iKeyOrder getKeyCode(int keyCode) {
	iKeyOrder userOrder;
	switch (keyCode) {
		case KeyEvent.VK_Z:
			userOrder = new KeyOrder(Order.UP);
			break;
		case KeyEvent.VK_D:
			userOrder = new KeyOrder(Order.RIGHT);
			break;
		case KeyEvent.VK_S:
			userOrder = new KeyOrder(Order.DOWN);
			break;
		case KeyEvent.VK_Q:
			userOrder = new KeyOrder(Order.LEFT);
			break;
		case KeyEvent.VK_UP:
			userOrder = new KeyOrder(Order.UP);
			break;
		case KeyEvent.VK_RIGHT:
			userOrder = new KeyOrder(Order.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			userOrder = new KeyOrder(Order.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			userOrder = new KeyOrder(Order.LEFT);
			break;
		case KeyEvent.VK_SPACE:
			userOrder = new KeyOrder(Order.SHOOT);
			break;
        case KeyEvent.VK_L:
            userOrder = new KeyOrder(Order.DOWNLEFT);
            break;
        case KeyEvent.VK_M:
            userOrder = new KeyOrder(Order.DOWNRIGHT);
            break;
        case KeyEvent.VK_P:
            userOrder = new KeyOrder(Order.UPRIGHT);
            break;
        case KeyEvent.VK_O:
            userOrder = new KeyOrder(Order.UPLEFT);
            break;
		default:
			userOrder = new KeyOrder(Order.STATIC);
	}
	return userOrder;
}
	
}
