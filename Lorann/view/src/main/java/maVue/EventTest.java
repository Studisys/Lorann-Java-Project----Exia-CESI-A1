package maVue;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventTest {

	
	 @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	        int keyCode = 90;
	    }

	    @AfterClass
	    public static void tearDownAfterClass() throws Exception {
	    }

	    @Before
	    public void setUp() throws Exception {
	    }

	    @After
	    public void tearDown() throws Exception {
	    }

	    @Test
	    public void getKeyCode(int keyCode)
	    {
	        if(keyCode == KeyEvent.VK_Z)
	        {
	            return true;
	        }
	        else
	        {
	        	fail("Not ok");
	        }
	    
	}

}
