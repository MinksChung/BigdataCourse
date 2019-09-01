package 상속;

public class Man extends Person {
	// 멤버변수 2개, 멤버메소드 2개
	
	String power;
	
	public Man() {
	}
	
	public Man(String power) {
		super();
		this.power = power;
	}
	
	public Man(String name, int age, String power) {
		super(name, age);
		this.power = power;
	}
	
	public void run() {
		sleep();
		System.out.println("빨리 달리다.");
	}
	
}
