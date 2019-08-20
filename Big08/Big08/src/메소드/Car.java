package 메소드;

public class Car {
	String color;
	int speed;
	public void speedup() {
		System.out.println("speedup");
	}
	
	public void speeddown() {
		System.out.println("speeddown");
	}
	
	public int getspeed() {
		return speed;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}
}
