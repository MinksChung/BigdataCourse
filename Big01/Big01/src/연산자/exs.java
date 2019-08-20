package 연산자;

import javax.swing.JOptionPane;

public class exs {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("첫번째를 입력하세요!");
		String s2 = JOptionPane.showInputDialog("두번째를 입력하세요!");
		String s3 = JOptionPane.showInputDialog("세번째를 입력하세요!");
		String s123 = "***love " + s1 + ", 실적 " + s2 + "!***";
			System.out.println(s123);
				
		String info1 = JOptionPane.showInputDialog("당신의 이름은?");
		String info2 = JOptionPane.showInputDialog("당신의 나이는?");
		String info12 = "나의 이름은 " + info1 + "이고, 나이는 " + info2 + "세 입니다.";
			System.out.println(info12);
		
		int age = 22;
			if (age>20) {
				System.out.println("성인입니다.");
			} else {
				System.out.println("미성인입니다.");
			}
			
	}

}
