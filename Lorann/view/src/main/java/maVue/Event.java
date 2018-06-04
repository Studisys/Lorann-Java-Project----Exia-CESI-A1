package maVue;

import java.awt.event.KeyEvent;

import monController.iOrderPerformer;
import monController.iKeyOrder;
import monController.Order;
import monController.KeyOrder;
import maVue.iEventPerformer;

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
	private iKeyOrder getKeyCode(int keyCode) {
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
		default:
			userOrder = null;
	}
	return userOrder;
}
	
}
