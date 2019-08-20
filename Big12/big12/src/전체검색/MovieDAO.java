package 전체검색;

import java.sql.*;

public class MovieDAO {

	public MovieDTO select(String sid) throws Exception {
		// 1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok...");

		// 2. DB연결-3가지
		// url, user, password
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok...");

		// 3. SQL문 결정
		String sql = "select * from movie where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);

		System.out.println("3. SQL문 객체화 ok...");

		// 4. SQL문 실행 요청
//		ps.executeUpdate(); => c, u, d만! 
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 실행 요청 ok...");

		MovieDTO dto = new MovieDTO();
		if (rs.next()) {
			System.out.println(rs.getRow());
			String id = rs.getString(1);
			String title = rs.getString(2);
			String company = rs.getString(3);
			String actor = rs.getString(4);
			dto.setId(id);
			dto.setTitle(title);
			dto.setCompany(company);
			dto.setActor(actor);
		}
//		return id, pw, name, tel; //불가능
		return dto; // 묶어서 보냄.
	}
}
