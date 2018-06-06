package myModel;

// TODO: Auto-generated Javadoc
/**
 * The Class levelCheck.
 */
public class levelCheck {

	/**
	 * Check if there is any illegal character in the string grabbed from the string DBB
	 *  Also checks if the string is longer or shorter than 240 characters.
	 *
	 * @param level the level
	 * @return true, if successful
	 */
	
	public boolean check(String level)
	{
		int hasInvalid=0;
		boolean isCompatible;
		for (int i=0;i<240;i++)
		{
		    char charLevel = level.charAt(i);
		    /** If not any of the following letters, do what is in default parts*/
		    switch(charLevel)
		    {
		        case 'A' :
		        	break;
		        case 'B' :
		        	break;

		        case 'H' :
		        	break;

		        case 'J' :
		        	break;

		        case 'K' :
		        	break;

		        case 'S' :
		        	break;

		        case 'T' :
		        	break;

		        case 'U' :
		        	break;

		        case 'V' :
		        	break;

		        case 'W' :
		        	break;

		        case 'X' :
		        	break;

		        case 'Y' :
		        	break;

		        default :
		        	hasInvalid++;
		    }    
		}
		if(hasInvalid == 0)
		{
			isCompatible = true;
		}
		else 
		{
			isCompatible = false;
		}
		if(level.length()!=240)
		{
			isCompatible = false;
		}
		return isCompatible;
	}
}
