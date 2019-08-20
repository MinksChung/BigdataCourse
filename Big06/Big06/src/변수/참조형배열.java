package 변수;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.colorchooser.ColorSelectionModel;

public class 참조형배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(500,500);
		JButton[] buttons = new JButton[200];
		Color[] colors = {Color.blue, Color.yellow, Color.gray};
		Random random = new Random();
		for ( int i =0; i<buttons.length; i++) {
			buttons[i]= new JButton(i+"번");
			int index = random.nextInt(3);
			buttons[i].setBackground(colors[index]);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}
