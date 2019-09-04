package 인터페이스테스트;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainTest extends JFrame {

	public MainTest() {
	
		setSize(500,500);
		
		JButton b = new JButton("클릭");
		add(b);
		
		Action a = new Action();
		b.addActionListener(a);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MainTest name = new MainTest();
		

	}

}
