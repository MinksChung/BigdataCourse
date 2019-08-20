package 조건문;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test7 {
	private static JTextField tf1;
	private static JTextField tf2;
	static int qty = 0;
	static int price = 5000;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("중국집메뉴판");
		f.setSize(600,500);
		f.getContentPane().setLayout(null);
		
		JButton bt1 = new JButton("짬뽕");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qty++;
				String qty1 = Integer.toString(qty);
				tf1.setText(qty1 + "개");
				tf2.setText((qty*5000) + "원");
			}
		});
		bt1.setBounds(35, 25, 77, 41);
		f.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("우동");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qty++;
				String qty1 = Integer.toString(qty);
				tf1.setText(qty1 + "개");
				tf2.setText((qty*5000) + "원");
			}
		});
		bt2.setBounds(135, 25, 77, 41);
		f.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("짜장");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qty++;
				String qty1 = Integer.toString(qty);
				tf1.setText(qty1 + "개");
				tf2.setText((qty*5000) + "원");
			}
		});
		bt3.setBounds(240, 25, 77, 41);
		f.getContentPane().add(bt3);
		
		JLabel lb1 = new JLabel("    개수");
		lb1.setFont(new Font("굴림", Font.PLAIN, 18));
		lb1.setBounds(329, 25, 78, 41);
		f.getContentPane().add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(419, 25, 126, 41);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel imglb = new JLabel(new ImageIcon("./food.png"));
		imglb.setBounds(123, 109, 319, 247);
		f.getContentPane().add(imglb);
		
		JLabel lb2 = new JLabel("총 합계금액은?");
		lb2.setFont(new Font("굴림", Font.PLAIN, 30));
		lb2.setBounds(45, 401, 225, 41);
		f.getContentPane().add(lb2);
		
		tf2 = new JTextField();
		tf2.setBounds(282, 401, 225, 41);
		f.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		
		f.setVisible(true);
	}

}
