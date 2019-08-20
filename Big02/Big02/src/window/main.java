package window;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class main {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("공고검색시스템");
		frame.setSize(500,500);
		
		t1 = new JTextField();
		t1.setBackground(Color.MAGENTA);
		t1.setFont(new Font("굴림", Font.PLAIN, 45));
		frame.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JLabel t2 = new JLabel("여기글시가들간다");
		t2.setBackground(Color.GREEN);
		t2.setFont(new Font("굴림", Font.PLAIN, 45));
		frame.getContentPane().add(t2, BorderLayout.CENTER);
		
		JButton t3 = new JButton("나를눌러요");
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = t1.getText();
				System.out.println(data);
				t2.setText(data);
			}
		});
		t3.setForeground(Color.CYAN);
		t3.setFont(new Font("굴림", Font.PLAIN, 41));
		frame.getContentPane().add(t3, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

}
