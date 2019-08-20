package window;

import javax.swing.JButton;
import javax.swing.JFrame;

public class window {

	public static void main(String[] args) {
		JButton b1 = new JButton("abd");
		
		JFrame name = new JFrame();
		name.setTitle("첫번째프레임");
		name.setSize(600,600);
		JButton butt = new JButton("abd");
		name.add(butt);
		name.setVisible(true);
		
	}

}
