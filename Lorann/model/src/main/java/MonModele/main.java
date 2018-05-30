package MonModele;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {

	private static Item[][] tableau;
	private static String level = "AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYYYYYAYXXYAJJJJJJJJJJJAYYXYXXYXYYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYYYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAYYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH";
	private static char[] cast;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map maMap = new Map();
		maMap.setLevel(level);
		cast = level.toCharArray();
		
		JFrame window = new JFrame();
	    window.setSize(640, 384);
	    window.setTitle("Lorann");
	    window.setLocationRelativeTo(null);
	    window.setResizable(true);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.BLACK);
	    
		

	}

}
