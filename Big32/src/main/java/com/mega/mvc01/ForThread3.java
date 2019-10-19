package com.mega.mvc01;

public class ForThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.err.println("thread3");
		}
	}
	
}
