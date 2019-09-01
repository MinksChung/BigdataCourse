package 상속;

// 단일 상속만 가능
public class SuperMan extends Man{
	// 멤버변수 3개, 멤버메소드 3개
	
	boolean fly;
	
	public SuperMan() {
	}
	
	public SuperMan(boolean fly) {
		super(); // 부모클래스의 기본 생성자
		// 자식클래스의 생성자가 호출될 때는
		// 부모클래스의 기본생성자가 무조건 호출
		this.fly = fly;
	}
	
	public SuperMan(String name, int age, String power, boolean fly) {
		super(name, age, power);
		this.fly = fly;
	}

	public void fly() {
		System.out.println("하늘을 날다");
	}

	@Override // 재정의
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	// 기본형 -> 값
	// 참조현 -> 주소값
	
}
