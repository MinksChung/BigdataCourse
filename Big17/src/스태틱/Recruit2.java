package 스태틱;

import javax.swing.JOptionPane;

public class Recruit2 {

	public static void main(String[] args) {

		System.out.println(Employee.cnt);
		System.out.println(Employee.getCount());
		
		// 객체 생성
		Employee e1 = new Employee("홍길동", 25);
		System.out.println(Employee.cnt);
		System.out.println(e1.getCount());
		
		//JOptionPane.showMessageDialog(null, "static method");
		
	}

}
