package 스태틱;

public class Employee {

	static int sum;
	static int cnt=5;
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		sum+=age;
		cnt++;
		this.name = name;
		this.age = age;
	}
	
	public static int getCount() { // 일반 메소드
		return cnt; // static 변수
		// static메소드내에 static변수만 사용 가능!
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}
