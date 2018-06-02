// Open an imput window from user
// Oh wait, according to Bastien, it better be a JFrame with JButtons? Will see this soon

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public static void main(String[] args) {
// Why can't I change the window title ? I don't know, it's Java.
		JFrame frame = new JFrame("Lorann");
		frame.setTitle("Lorann");
		Object userLevelInput = JOptionPane.showInputDialog(frame, "Please enter the level number you wish to be loaded :");
        // Will print the user Input in console
        // Need to pass it to the map data acq function
        System.out.println(userLevelInput);
}