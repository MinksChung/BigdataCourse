package 스태틱;

public class Recruit {

	public static void main(String[] args) {

		Employee e1 = new Employee("홍길동", 25);
		Employee e2 = new Employee("김삿갓", 30);
		Employee e3 = new Employee("이순신", 26);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(Employee.sum/Employee.cnt);
		
	}

}
