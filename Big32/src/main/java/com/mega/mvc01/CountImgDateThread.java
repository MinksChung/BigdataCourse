package com.mega.mvc01;

import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountImgDateThread extends JFrame {
	JLabel counter;
	JLabel img;
	String[] list = { "one.jpg", "two.jpg", "three.jpg", "four.jpg", "five.jpg" };
	JLabel dateTime;	

	public CountImgDateThread() {

		setTitle("쓰레드");
		setSize(500, 500);
		getContentPane().setLayout(null);

		counter = new JLabel("");
		counter.setBounds(50, 25, 123, 45);
		getContentPane().add(counter);

		img = new JLabel("");
		img.setBounds(50, 107, 411, 97);
		getContentPane().add(img);

		dateTime = new JLabel("");
		dateTime.setBounds(50, 230, 317, 53);
		getContentPane().add(dateTime);

		CounterThread cThread = new CounterThread();
		cThread.start();

		ImgThread iThread = new ImgThread();
		iThread.start();
		
		DateTimeThread dtThread = new DateTimeThread();
		dtThread.start();

		setVisible(true);

	}

	public static void main(String[] args) {
		CountImgDateThread name = new CountImgDateThread();
	}

	public class CounterThread extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter.setText("카운트 : " + i);
				if (i == 1) {
					System.exit(1);
				}
			}
		}

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
				if (i == 4) {
					i = -1;
				}
			}
		}
	}

	public class DateTimeThread extends Thread {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LocalDateTime now = LocalDateTime.now();
				dateTime.setText("오늘 : " + now);
			}
		}
	}

}
