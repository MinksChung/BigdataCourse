package 상속;

public class SuperManUser2 {

	public static void main(String[] args) {
		
		SuperMan superMan = new SuperMan("클라크", 10, "신의 영역", true);
		
		System.out.println(superMan);
		
		superMan.eat();
		superMan.sleep();
		superMan.run();
		superMan.fly();

	}

}
