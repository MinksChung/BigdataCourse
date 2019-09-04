package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO_jdbc {

	public void insert(MemberDTO dto) throws Exception {
		
		// 2. DB처리
		// 1) 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok..");
		
		// 2) db연결
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root";
		String password = "1q2w3e4r";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok..");

		// 3) SQL문 객체화
		String sql = "insert into member2 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		System.out.println("3. sql문 객체화 ok..");

		// 4) SQL문 실행 요청
		ps.execute();
		System.out.println("4. sql문 실행 요청 ok..");
		
		ps.close();
		con.close();

	}
	
}
