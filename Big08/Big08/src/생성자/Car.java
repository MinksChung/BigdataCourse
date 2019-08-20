package 생성자;

import java.awt.Color;

public class Car {
	String color;
	int speed;
	public Car() {
	}

	public Car(String s, int sp) {
		color = s;
		speed = sp;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}
}
