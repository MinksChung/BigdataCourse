package 메소드;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CarUser {


	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "red";
		car1.speed = 100;
		
		
		
		car1.speedup();
		car1.speeddown();
		car1.getspeed();
		
		System.out.println(car1);
		int result = car1.getspeed();
		System.out.println(car1.getspeed());
		System.out.println(result);
	}

}
