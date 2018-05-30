package maVue;

import java.awt.event.KeyEvent;

import monController.iEventPerformer;
import monController.iUserOrder;
import monController.Order;
import monController.UserOrder;
import maVue.iEventPerformer;

public class Event implements iEventPerformer{
	private final iOrderPerformer orderPerformer;

	public Event(iOrderPerformer orderPerformer)
	{
		this.orderPerformer = orderPerformer;
	}
	@Override
	public void eventPerform(final KeyEvent keyCode) {
		final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerformer.orderPerform(userOrder);
		}
	}
	private iUserOrder getKeyCode(int keyCode)
	IUserOrder userOrder;
	switch (keyCode) {
		case KeyEvent.VK_UP:
			userOrder = new UserOrder(0, Order.UP);
			break;
		case KeyEvent.VK_RIGHT:
			userOrder = new UserOrder(0, Order.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			userOrder = new UserOrder(0, Order.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(0, Order.LEFT);
			break;
		case KeyEvent.VK_CONTROL:
			userOrder = new UserOrder(0, Order.SHOOT);
			break;

		case KeyEvent.VK_Z:
			userOrder = new UserOrder(1, Order.UP);
			break;
		case KeyEvent.VK_D:
			userOrder = new UserOrder(1, Order.RIGHT);
			break;
		case KeyEvent.VK_S:
			userOrder = new UserOrder(1, Order.DOWN);
			break;
		case KeyEvent.VK_Q:
			userOrder = new UserOrder(1, Order.LEFT);
			break;
		case KeyEvent.VK_SHIFT:
			userOrder = new UserOrder(1, Order.SHOOT);
			break;
		default:
			userOrder = null;
	}
	return userOrder;
}
	@Override
	public void event(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
}
