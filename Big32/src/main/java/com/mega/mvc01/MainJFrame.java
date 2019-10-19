package com.mega.mvc01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainJFrame extends JFrame {
	JLabel counter;
	
	public MainJFrame() {
		setTitle("쓰레드");
		setSize(500, 500);
		getContentPane().setLayout(null);

		counter = new JLabel("");
		counter.setBounds(40, 25, 407, 71);
		getContentPane().add(counter);

		CounterThread cThread = new CounterThread();
		cThread.start();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MainJFrame name = new MainJFrame();
	}

	// 클래스내에 클래스를 내부에 끼워넣어서 쓸 수 있다.
	// 내부 클래스, inner class
	public class CounterThread extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter.setText("카운트 : " + i);
				if(i==1) {
					i=1000;
				}
			}
		}

	}

}
