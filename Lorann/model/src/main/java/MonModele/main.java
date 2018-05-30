package MonModele;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {


	private static String level = "AJJJJJJJJJJJJJJJJJJAXYYYUYYYYYYYYYYYYYYXXYYAJJJAYAJJJJJJAAYXXYAYYYYYYYYYYYYYXYYXXYXYAJJJJJJJJAYYXYHXXYXYXYYYYKYYYXYYXYAAXYXYXYYYYYYYYXYAASAAXYXYAJJJAYAJJAYYXYYXXYAYYYYYYYYYYYYBAYYXXYYAJJJJJJJJJJJJAAYXXYTYYYYYYYYYYYYYYYYXAJJJJJJJJJJJJJJJJAJA";
	
	public static void main(String[] args) {
		
		Map maMap = new Map();
		maMap.buildMap(level);
		
		JFrame window = new JFrame();
	    window.setSize(1200, 720);
	    window.setTitle("Lorann");
	    window.setLocationRelativeTo(null);
	    window.setResizable(false);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.BLACK);
	    pan.setLayout(new GridBagLayout());
	    GridBagConstraints caller = new GridBagConstraints();
	    
	    caller.gridheight = 1;
	    caller.gridwidth = 1;
	  
	  int h=0;
	  
	    for (int y = 0; y<=maMap.getRow()-1; y++)
	    {
	    	for (int x = 0; x<=maMap.getColumm()-1; x++)
	    	{
	    		Icon itemIcon = maMap.itemArray[h].getImage();
	    		JLabel myLabel = new JLabel();
	    		myLabel.setIcon(itemIcon);
	    		pan.add(myLabel);
	    		caller.gridx = x;
	    		caller.gridy = y;
	    		pan.add(myLabel, caller);
	    		h++;
	    	}
	    }
	    
	    window.setContentPane(pan);
		window.setVisible(true);

	}

}
