package window;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.text.FlowView.FlowStrategy;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 예약시스템2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("예약시스템");
		f.setSize(543,331);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel word1lblNewLabel = new JLabel("단어1");
		word1lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 42));
		f.getContentPane().add(word1lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 42));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel word2 = new JLabel("단어2");
		word2.setFont(new Font("굴림", Font.PLAIN, 42));
		f.getContentPane().add(word2);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 42));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("단어를합해라");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				t3.setText(s1+s2);
			}
		});
	
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 42));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
	}

}
