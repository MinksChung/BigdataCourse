package 메소드;

import javax.naming.spi.DirStateFactory.Result;
import javax.security.auth.x500.X500Principal;

public class Cal {
	static int price = 5000;
	static int qty = 5;
	

	public String add2() {
		String s1 = "hello";
		String s2 = "Java";
		return s1 + s2;
	}
	
	public int min(int x) {
			if (x>20000) {
			x = x - 5000;
			return x;
		}
		return x;
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	public Double add(int x, Double y) {
		return x+y;
	}
	public double add(Double x, Double y) {
		return x+y;
	}
	public String add(String x, String y) {
		return x+y;
	}
	public double add(Double x, int y) {
		return x+y;
	}
	public String add(String x, int y, String z) {
		return x+y+z;
	}
	public double test1(int x, int y) {
		return x+y;
	}
	public int test2(int x, int y) {
		return x-y;
	}
	public int test3(int x, int y) {
		return x*y;
	}
	public double test4(int x, int y) {
		return x/y;
	}
	







}
