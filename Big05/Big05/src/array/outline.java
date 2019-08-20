package array;

import java.security.cert.CertPathChecker;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.w3c.dom.css.CSSCharsetRule;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class outline {
	private static JTextField finaltf;
	
	public static void main(String[] args) {
	
		
		JFrame f = new JFrame();
		f.setSize(500, 400);
		
		JLabel lblNewLabel = new JLabel("극장예매시스템");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel.setBounds(26, 10, 179, 38);
		f.getContentPane().add(lblNewLabel);
		
		JButton no1 = new JButton("1");
		no1.setBounds(26, 69, 62, 54);
		f.getContentPane().add(no1);
		
		JButton no2 = new JButton("2");
		no2.setBounds(108, 69, 62, 54);
		f.getContentPane().add(no2);
		
		JButton no3 = new JButton("3");
		no3.setBounds(199, 69, 62, 54);
		f.getContentPane().add(no3);
		
		JButton no4 = new JButton("4");
		no4.setBounds(283, 69, 62, 54);
		f.getContentPane().add(no4);
		
		JButton no5 = new JButton("5");
		no5.setBounds(364, 69, 62, 54);
		f.getContentPane().add(no5);
		
		JButton no6 = new JButton("6");
		no6.setBounds(72, 133, 62, 54);
		f.getContentPane().add(no6);
		
		JButton no7 = new JButton("7");
		no7.setBounds(163, 133, 62, 54);
		f.getContentPane().add(no7);
		
		JButton no8 = new JButton("8");
		no8.setBounds(247, 133, 62, 54);
		f.getContentPane().add(no8);
		
		JButton no9 = new JButton("9");
		no9.setBounds(329, 133, 62, 54);
		f.getContentPane().add(no9);
		
		JButton apply = new JButton("예약신청");
		apply.setForeground(Color.BLUE);
		apply.setBounds(53, 225, 88, 54);
		f.getContentPane().add(apply);
		
		finaltf = new JTextField();
		finaltf.setBounds(163, 225, 310, 59);
		f.getContentPane().add(finaltf);
		finaltf.setColumns(10);
		
	

		f.setVisible(true);
}
}

