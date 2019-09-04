package 스태틱;

public class DayWorkMain {

	public static void main(String[] args) {
		
		DayWork dw1 = new DayWork("자바", 10, "강남");
		DayWork dw2 = new DayWork("여행", 15, "강원도");
		DayWork dw3 = new DayWork("운동", 11, "피트니스");
		
		System.out.println(dw1);
		System.out.println(dw2);
		System.out.println(dw3);
		
		System.out.println(DayWork.sum);
		System.out.println(DayWork.sum/DayWork.cnt);
		System.out.println(DayWork.cnt);

	}

}
