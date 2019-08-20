package 조건문;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class 윈도우 {
	private static JTextField pw;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의윈도우");
		f.setSize(500,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JTextField t3 = new JTextField(10);
		t3.setBackground(Color.ORANGE);
		JTextField id = new JTextField(10);
		id.setFont(new Font("굴림", Font.PLAIN, 45));
		JButton t2 = new JButton("로그인처리");
		JLabel img = new JLabel("");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = id.getText();
				String data2 = pw.getText();
				if (data1.equals("root")&&data2.equals("1234")) {
					t3.setText("로그인이되다.");
					ImageIcon icon1 = new ImageIcon("ok.jpg");
					img.setIcon(icon1);
			} else {
				t3.setText("오류");
				ImageIcon icon2 = new ImageIcon("no.jpg");
				img.setIcon(icon2);
			}
			}});
		t2.setFont(new Font("굴림", Font.PLAIN, 45));
		
		t3.setFont(new Font("굴림", Font.PLAIN, 45));
		
		JLabel lblId = new JLabel("id:");
		lblId.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblId);
		f.getContentPane().add(id);
		
		JLabel lblPw = new JLabel("pw:");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblPw);
		
		pw = new JTextField(10);
		pw.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(pw);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		
		f.getContentPane().add(img);
		ImageIcon icon1 = new ImageIcon("ok.jpg");
		ImageIcon icon2 = new ImageIcon("no.jpg");
		
		f.setVisible(true);
	}

}
