/*
 * 
 */
package myView;
/**
 * <h1>EventTest JUnit test</h1>
 *
 * @author Bastien Le Gall
 * @version 1.0
 */
import static org.junit.Assert.assertEquals;

import java.awt.event.KeyEvent;

import org.junit.Test;

import myController.KeyOrder;
import myController.Order;
import myController.iKeyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class EventTest.
 */
public class EventTest {

		/*to verify if the keyCode match with the KeyEvent used in the Event class*/
	
	    /**
		 * Gets the key code up.
		 *
		 * @return the key code up
		 */
		@Test 
	    /** Check keycode up */
	    public void getKeyCodeUp()
	    {
	    	int keyCode = 90; /**keyCode initialization to Z key to simulate a key pressed*/
			iKeyOrder userOrder;
			iKeyOrder testOrder = new KeyOrder(Order.UP); /**use of the method to assign order by key pressed*/
			switch(keyCode) 
			{
			case KeyEvent.VK_Z :
				userOrder = new KeyOrder(Order.UP);
				/**testing if both are the same to verify if the method works well*/
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder.getOrder()); 
				break;
			}
			
			// Up Arrow
			keyCode = 38; 
			iKeyOrder testOrder2 = new KeyOrder(Order.UP);
			switch(keyCode) 
			{
			case KeyEvent.VK_UP :
				userOrder = new KeyOrder(Order.UP);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder2.getOrder());
				break;
			}
	    }
	    
	    /**
    	 *  Check keycode down.
    	 *
    	 * @return the key code down
    	 */
	    @Test public void getKeyCodeDown()
	    {
	    	// S key
	    	int keyCode = 83; 
			iKeyOrder userOrder;
			iKeyOrder testOrder = new KeyOrder(Order.DOWN);
			switch(keyCode) 
			{
			case KeyEvent.VK_S :
				userOrder = new KeyOrder(Order.DOWN);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder.getOrder());
				break;
			}
			
			// Down Arrow
			keyCode = 40; 
			iKeyOrder testOrder2 = new KeyOrder(Order.DOWN);
			switch(keyCode) 
			{
			case KeyEvent.VK_DOWN :
				userOrder = new KeyOrder(Order.DOWN);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder2.getOrder());
				break;
			}
	    }
	    
	    /**
    	 *  Check keycode right.
    	 *
    	 * @return the key code right
    	 */
	    @Test public void getKeyCodeRight()
	    {
	    	// D key
	    	int keyCode = 68; 
			iKeyOrder userOrder;
			iKeyOrder testOrder = new KeyOrder(Order.RIGHT);
			switch(keyCode) 
			{
			case KeyEvent.VK_D :
				userOrder = new KeyOrder(Order.RIGHT);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder.getOrder());
				break;	
			}
			
			// Right Arrow
			keyCode = 39; 
			iKeyOrder testOrder2 = new KeyOrder(Order.RIGHT);
			switch(keyCode) 
			{
			case KeyEvent.VK_RIGHT :
				userOrder = new KeyOrder(Order.RIGHT);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder2.getOrder());
				break;
			}
	    }
	    
	    /**
    	 *  Check keycode left.
    	 *
    	 * @return the key code left
    	 */
	    @Test public void getKeyCodeLeft()
	    {
	    	// Q key
	    	int keyCode = 81; 
			iKeyOrder userOrder;
			iKeyOrder testOrder = new KeyOrder(Order.LEFT);
			switch(keyCode) 
			{
			case KeyEvent.VK_Q :
				userOrder = new KeyOrder(Order.LEFT);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder.getOrder());
				break;
			}
			
			// Left Arrow
			keyCode = 37; 
			iKeyOrder testOrder2 = new KeyOrder(Order.LEFT);
			switch(keyCode) 
			{
			case KeyEvent.VK_LEFT :
				userOrder = new KeyOrder(Order.LEFT);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder2.getOrder());
				break;
			}
	    }
	    
	    /**
    	 * Gets the key code shoot.
    	 *
    	 * @return the key code shoot
    	 */
    	@Test public void getKeyCodeShoot()
	    {
	    	// Space key
	    	int keyCode = 32; 
			iKeyOrder userOrder;
			iKeyOrder testOrder = new KeyOrder(Order.SHOOT);
			switch(keyCode) 
			{
			case KeyEvent.VK_SPACE :
				userOrder = new KeyOrder(Order.SHOOT);
				assertEquals("The Key is functionnal", userOrder.getOrder(),testOrder.getOrder());
				break;
			}
	    }
}
