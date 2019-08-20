package 연산자;

import javax.swing.JOptionPane;

public class exs2 {

	public static void main(String[] args) {
		
		double height = 177.8;
		double weight = 65.5;
		double std = (height -100)*0.9;
			if (weight>std) {
				System.out.println("초과체중입니다.");					
			} else { 
				System.out.println("정상체중입니다.");
			}
		
		
		int k1,k2,m1,m2;
		k1 = 4000; k2 = 4; m1 = 3000; m2 = 2;
		
		System.out.println("제품 계산서 입니다.");
		System.out.println("키보드 총 가격: " + (k1*k2));
		System.out.println("마우스 총 가격: " + (m1*m2));
		System.out.println("제품 총 가격: " + ((k1*k2)+ (m1*m2)));
	}

}
