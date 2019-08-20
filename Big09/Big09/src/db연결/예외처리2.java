package db연결;

public class 예외처리 {

	public static void main(String[] args) {
		//하단의 마이너에러 예외처리
		try {
		int[] num = {1,2,3};
		num[3]=4;//인덱스렝스에러
		}catch (Exception e) {
			e.printStackTrace(); //Block of code to handle errors
		}
		System.out.println("나는 실행될까");
	}

}
