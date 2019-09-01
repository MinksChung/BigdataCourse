package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		
		SuperMan superMan = new SuperMan();
		superMan.age = 10; // Person
		superMan.name = "클라크"; // Person
		superMan.power = "신의 영역"; // Man
		superMan.fly = true; // SuperMan
		
		System.out.println(superMan);
		
		superMan.eat();
		superMan.sleep();
		superMan.run();
		superMan.fly();

	}

}
