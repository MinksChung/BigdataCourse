package 변수;

import javax.swing.JOptionPane;

public class 그래픽 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("수강과목을 입력하세요");
		String b = JOptionPane.showInputDialog("강의실을 입력하세요");
		String c = JOptionPane.showInputDialog("난이도를 입력하세요");
		System.out.println("출력을 시작합니다.");
		System.out.println("-----------------------------------------------");
		System.out.println("수강과목: " + a);
		System.out.println("강의실: " + b);
		System.out.println("난이도: " + c);
		System.out.println("-----------------------------------------------");
	}

}
