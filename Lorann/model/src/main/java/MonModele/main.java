package MonModele;

import java.awt.Color;
import java.awt.GridLayout;

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
	    window.setSize(640, 384);
	    window.setTitle("Lorann");
	    window.setLocationRelativeTo(null);
	    window.setResizable(false);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.WHITE);
	    pan.setLayout(new GridLayout(12,20));
	    
	    for (int i = 0; i <=maMap.itemArray.length - 1; i++)
	    {
	    	Icon itemIcon = maMap.itemArray[i].getImage();
            JLabel myLabel = new JLabel();
            myLabel.setIcon(itemIcon);
            pan.add(myLabel);
            window.setContentPane(pan);
	    }

		window.setVisible(true);

	}

}
