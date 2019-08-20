package 조건문;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Random;
import java.awt.event.ActionListener;
import java.security.Timestamp;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class test5 {
	static int user = 0;
	static int count = 0;
	static int winning = 0;
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		Random getrandom = new Random(3);
		int computer = getrandom.nextInt();
		
		JFrame f = new JFrame("Rock Paper Scissors");
		f.setSize(600, 400);
		
		JButton b1 = new JButton(new ImageIcon("./5-2.png"));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = 0;
				count++;
			}
		});
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		b1.setFont(new Font("굴림", Font.PLAIN, 29));
		f.getContentPane().add(b1);

		JButton b2 = new JButton(new ImageIcon("./5-1.png"));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = 1;
				count++;
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 29));
		f.getContentPane().add(b2);

		JButton b3 = new JButton(new ImageIcon("./5-3.png"));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = 2;
				count++;
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 29));
		f.getContentPane().add(b3);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);

	
		
		if (user == computer) {
			t2.setText("draw!");
		} else if (user == (computer + 1) % 3) {
			t2.setText("you win!");
			winning++;
		} else {
			t2.setText("you loss!");
		}
		String score = "total played" + count + "times, and you win " + winning + " times!";
		t1.setText(score);
		
		f.setVisible(true);

	}

}
