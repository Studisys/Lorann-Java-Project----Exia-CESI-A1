/*
 * 
 */
package myController;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Enum Order.</h1>
 *
 * @author Joël DIDIER and Nicolas DRAPIER
 * @version 0.1
 */
//An enumeration of the different actions that are used
public enum Order 
{
	   
   	/**  Go up. */
	UP,
	   
   	/**  To the right. */
	RIGHT,
	   
   	/**  Go down. */
	DOWN,
	   
   	/**  To the left. */	
	LEFT,
	   
   	/**  Diagonal Down - Right. */
    DOWNRIGHT,
    
    /**  Diagonal Down - Left. */
    DOWNLEFT,
    
    /**  Diagonal Up - Left. */
    UPLEFT,
    
    /**  Diagonal Up - Right. */
    UPRIGHT,
    
    /** Shoot it !. */
    SHOOT,

    /**  Freeze ! Do not move ! (Lorann). */
	STATIC;
}
