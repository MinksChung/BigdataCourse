package 변수;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(500, 500);

		JButton b1 = new JButton("가위");
		JButton b2 = new JButton("바위");
		JButton b3 = new JButton("보");

	//	b1.addActionListener();
	//	b2.addActionListener();
	//	b3.addActionListener();

		f.setVisible(true);
	}

}
