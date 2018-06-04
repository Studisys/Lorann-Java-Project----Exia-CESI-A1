// Open an imput window from user
// Oh wait, according to Bastien, it better be a JFrame with JButtons? Will see this soon

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public static void main(String[] args) {
// Why can't I change the window title ? I don't know, it's Java.
		// Asking the user for the level number
		JFrame frame = new JFrame("Lorann");
		frame.setTitle("Lorann");
		Object userLevelInput = JOptionPane.showInputDialog(frame, "Please enter the level number you wish to be loaded :");
		System.out.println(userLevelInput);
		
		// If users closes Input Window, kill the process.
		if (userLevelInput.equals(null)) {
			System.exit(0);
		}
}