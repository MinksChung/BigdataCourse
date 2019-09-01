package 형변환;

import javax.swing.*;

public class Window extends JFrame {
	JButton b;
	
	public Window() {
		setSize(500, 500);
		b = new JButton("나를 눌러요..");
		add(b);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	Window name = new Window();	
		
	}
	
}
