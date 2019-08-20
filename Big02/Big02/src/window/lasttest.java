package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lasttest {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;

	public static void main(String[] args) {
		JFrame f = new JFrame("회원가입화면입니다.");
		f.setSize(261,444);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("아 이 디:");
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t1.setText("");
		f.getContentPane().add(t1);
		t1.setColumns(20);
		
		JLabel label_1 = new JLabel("패스워드:");
		f.getContentPane().add(label_1);
		
		t2 = new JTextField();
		t2.setBackground(Color.ORANGE);
		f.getContentPane().add(t2);
		t2.setColumns(20);
		
		JLabel lblNewLabel = new JLabel("이      름:");
		f.getContentPane().add(lblNewLabel);
		
		t3 = new JTextField();
		t3.setBackground(Color.PINK);
		f.getContentPane().add(t3);
		t3.setColumns(20);
		
		JLabel label_2 = new JLabel("전화번호:");
		f.getContentPane().add(label_2);
		
		t4 = new JTextField();
		t4.setBackground(Color.ORANGE);
		f.getContentPane().add(t4);
		t4.setColumns(20);
		
		JButton btnNewButton = new JButton("회원가입을 진행하시겠습니까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				String s4 = t4.getText();
				t5.setText(s1+s2+s3+s4);
			}
		});
		f.getContentPane().add(btnNewButton);
		
		t5 = new JTextField();
		f.getContentPane().add(t5);
		t5.setColumns(20);
		f.setVisible(true);
	}

}
