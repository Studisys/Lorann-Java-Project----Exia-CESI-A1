package maVue;

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
	public void event(final KeyEvent keyCode) {
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
		default:
			userOrder = null;
	}
	return userOrder;
}
	
}
