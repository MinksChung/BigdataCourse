package com.mega.mvc01;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.err.println("증가 : " + i);
		}
	}
	
}
