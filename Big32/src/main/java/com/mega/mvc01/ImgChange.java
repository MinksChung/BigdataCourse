package com.mega.mvc01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mega.mvc01.MainJFrame.CounterThread;

public class ImgChange extends JFrame {
	JLabel img;
	String[] list = {"one.jpg", "two.jpg", "three.jpg", "four.jpg", "five.jpg"};
	
	public ImgChange() {
		
		setSize(500, 500);
		getContentPane().setLayout(null);
		
		img = new JLabel("");		
		img.setBounds(31, 26, 411, 97);
		getContentPane().add(img);
		
		ImgThread iThread = new ImgThread();
		iThread.start();
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		ImgChange name = new ImgChange();
		
	}
	
	public class ImgThread extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < list.length; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				if(i==4) {
					i=-1;
				}
			}
		}

	}
	
}
