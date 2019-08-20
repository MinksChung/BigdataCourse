package db연결;

import java.sql.DriverManager;

public class Db연결테스트 {

	public static void main(String[] args) throws Exception {
		//외부 API 내 클래스 끌고올때는 '예외처리'필요
		//예외처리 적용사항: 외부파일, db연결, 네트워크 등의 외부사항
		//필요이유: 마이너에러 발생시 계속처리 진행 강제를 위해
		//트라이-캐치귀찮아, 에러나면 나오긴하지만, 메인 호출괄호 다음에 throws 지정 + 적용범위선택으로 처리더편함
		Class.forName("com.mysql.jdbc.Driver");	
		System.out.println("1.커넥팅성공");
		
		//디비버에서 디비명우측클릭, 에디터드라이브셋팅 후 하단처럼 정보찔러준다.
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root";
		String password = "1234";
		
		//2 디비연결
		DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결성공....");
	}

}
