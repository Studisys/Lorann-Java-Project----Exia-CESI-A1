package MonModele;

public class levelCheck {

	public boolean check(String level)
	{
		int hasInvalid=0;
		boolean isCompatible;
		for (int i=0;i<240;i++)
		{
		    char charLevel = level.charAt(i);
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
