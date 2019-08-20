package 조건문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class t444 {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tf3;
	private static JTextField tf4;
	static String name = "";
	static int getyear = 0;

	public static void main(String[] args) {

		JFrame f = new JFrame("성인인증");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lb1 = new JLabel("이      름");
		lb1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lb1.setBounds(30, 45, 105, 55);
		f.getContentPane().add(lb1);

		tf1 = new JTextField();
		tf1.setFont(new Font("굴림", Font.PLAIN, 45));
		tf1.setBounds(147, 45, 247, 55);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);

		JLabel lb2 = new JLabel("출생년도");
		lb2.setFont(new Font("Dialog", Font.PLAIN, 25));
		lb2.setBounds(30, 125, 105, 55);
		f.getContentPane().add(lb2);

		tf2 = new JTextField();
		tf2.setFont(new Font("굴림", Font.PLAIN, 45));
		tf2.setColumns(10);
		tf2.setBounds(147, 125, 247, 55);
		f.getContentPane().add(tf2);

		JLabel lb3 = new JLabel("나      이");
		lb3.setFont(new Font("Dialog", Font.PLAIN, 25));
		lb3.setBounds(30, 210, 105, 55);
		f.getContentPane().add(lb3);

		tf3 = new JTextField();
		tf3.setFont(new Font("굴림", Font.PLAIN, 45));
		tf3.setColumns(10);
		tf3.setBounds(147, 210, 247, 55);
		f.getContentPane().add(tf3);
		
		tf4 = new JTextField();
		tf4.setBounds(209, 295, 241, 55);
		f.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		JButton bt1 = new JButton("인증");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String stryear = tf1.getText();
				int year = Integer.parseInt(stryear);
				Date date = new Date();
				int theyear = date.getYear();
				int thisyear = theyear + 1900;
				int age = thisyear - year;
				String strage = Integer.toString(age);
				tf3.setText(strage);
				
			}
		});
		bt1.setFont(new Font("굴림", Font.PLAIN, 30));
		bt1.setBounds(64, 295, 123, 55);
		f.getContentPane().add(bt1);

		
		f.setVisible(true);
		
	}
}
