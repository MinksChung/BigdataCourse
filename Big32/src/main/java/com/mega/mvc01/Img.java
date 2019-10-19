package com.mega.mvc01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Img {

	public Img() {
		
		JFrame f = new JFrame();
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		String[] list = {"one.jpg", "two.jpg", "three.jpg", "four.jpg", "five.jpg"};
		
		JLabel lblNewLabel = new JLabel("");		
		lblNewLabel.setBounds(31, 26, 411, 97);
		f.getContentPane().add(lblNewLabel);
		
		for(int i=0; i<list.length+1; i++) {
			if(i==5) {
				i=0;
			}
			ImageIcon icon = new ImageIcon(list[i]);
			lblNewLabel.setIcon(icon);
			f.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {

		Img name = new Img();
		
	}
}
