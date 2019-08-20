package window;

import java.util.Scanner;

public class inputtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			/*System.out.print("이름입력>>");
			String name = sc.next();
			System.out.println("내 이름은 " + name);
			
			System.out.print("내 나이는>> " );
			int age = sc.nextInt();
		 	System.out.println("내 나이는>> " + age);
		 	
		 	System.out.print("내 몸무게>> " );
		 	double weight = sc.nextDouble()();
		 	System.out.println("내 몸무게는 " + weight );
	
		 	System.out.print("저녁먹을래?>> " );
		 	boolean yesorno = sc.nextBoolean();
		 	System.out.println("저녁을 먹는지는 " + yesorno);*/
			
			System.out.print("첫번째 숫자를 넣어주세요>> " );
		 	int number1 = sc.nextInt();
		 	System.out.print("두번째 숫자를 넣어주세요>> " );
		 	int number2 = sc.nextInt();
		 	int bigger;
		 	if (number1 > number2) {
		 		bigger = number1;
		 	} else {
		 		bigger = number2;
		 	}
		 	System.out.println("두수의 합은 : " + (number1+number2));
		 	System.out.println("두수의 차은 : " + (number1+number2));
		 	System.out.println("두수의 곱은 : " + (number1+number2));
		 	System.out.println("두수의 나눔은 : " + (number1+number2));
		 	System.out.println("둘 중 더 큰 수는 : " + (bigger));
		 	
	}

}
