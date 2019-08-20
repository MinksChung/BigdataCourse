package 조건문;

import java.util.Scanner;

public class if_test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 스티커입니까?");
		int qtystk = sc.nextInt();
		System.out.println("개당 얼마짜리 스티커입니까?");
		int prcstk = sc.nextInt();
		System.out.println("몇개의 노트입니까?");
		int noteqty = sc.nextInt();
		System.out.println("개당 얼마짜리 노트입니까?");
		int noteprc = sc.nextInt();
		
		int total = (qtystk*prcstk) + (noteprc*noteqty);
		if (total >=25000) {
			total = total - 3000;
		}
		System.out.println("스티커 총가격은 " + (qtystk*prcstk));
		System.out.println("노트 총가격은 " + (noteprc*noteqty));
		System.out.println("-------------------------------------------");
		System.out.println("총 결제금액은 " + total + "원입니다.");
	}

}




