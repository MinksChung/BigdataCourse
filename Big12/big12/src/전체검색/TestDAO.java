package 전체검색;

import java.sql.*;
import java.util.ArrayList;

public class TestDAO {

	public void selectAll() throws Exception {
		// dto들을 묶어줄 class

		// 1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok...");

		// 2. DB연결-3가지
		// url, user, password
		String url = "jdbc:mysql://localhost:3306/phone?characterEncoding=utf8";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok...");

		// 3. SQL문 결정
		String sql = "select * from test2";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 객체화 ok...");

		// 4. SQL문 실행 요청
//		ps.executeUpdate(); => c, u, d만! 
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 실행 요청 ok...");
		while (rs.next()) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			System.out.println(id + " " + pw);
			System.out.println("-------------");
		}
	}

}
