package 상속;

public class Person {

	String name;
	int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void sleep() {
		System.out.println("잠을 자다.");
	}
	
	public void eat() {
		System.out.println("먹다.");
	}
	
}
