package 조건문;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 업다운윈도우 {
	static int counting = 0;
	private static JTextField Rndnum2;
	private static JTextField trying2;
	private static JTextField result1;

	public static void main(String[] args) {
		
	 Random rndnum = new Random();
	 int target = rndnum.nextInt(100);
	
		 
		JFrame f = new JFrame("업다운");
		f.setSize(500,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel Rndnum1 = new JLabel("랜덤숫자");
		Rndnum1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(Rndnum1);
		
		Rndnum2 = new JTextField();
		Rndnum2.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(Rndnum2);
		Rndnum2.setColumns(10);
		
		JLabel trying1 = new JLabel("입력숫자");
		trying1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(trying1);
		
		trying2 = new JTextField();
		trying2.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(trying2);
		trying2.setColumns(10);
		
		JLabel resultimg = new JLabel("");
		
		JButton click1 = new JButton("클릭!");
		click1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = trying2.getText();
				int data2 = Integer.parseInt(data);
							if (target == data2) {
							counting++;
							ImageIcon img1 = new ImageIcon("ok.jpg");
							resultimg.setIcon(img1);
							result1.setText("정답! 총 시도횟수는 " + counting);
							
						} else if (target > data2) {
							ImageIcon img1 = new ImageIcon("no.jpg");
							resultimg.setIcon(img1);
							counting++;
							result1.setText("down! 현재 총 시도횟수는 " + counting);
							
						} else if (target < data2) {
							ImageIcon img1 = new ImageIcon("no.jpg");
							resultimg.setIcon(img1);
							counting++;
							result1.setText("up! 현재 총 시도횟수는" + counting);
							
						}
					}
				
			
		});
		click1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(click1);
		result1 = new JTextField();
		result1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(result1);
		result1.setColumns(15);
		f.getContentPane().add(resultimg);
		
		 
		 
		f.setVisible(true);
	}

}
