package com.mega.mvc01;

public class Thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			System.err.println("감소 : " + i);
		}
	}
	
}
