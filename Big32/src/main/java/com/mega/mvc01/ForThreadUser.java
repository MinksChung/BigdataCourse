package com.mega.mvc01;

public class ForThreadUser {

	public static void main(String[] args) {

		ForThread1 t1 = new ForThread1(); 
		ForThread2 t2 = new ForThread2(); 
		ForThread3 t3 = new ForThread3(); 
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
