package 전체검색;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {

	public ArrayList<MemberDTO> selectAll() throws Exception {
		// dto들을 묶어줄 class
		ArrayList<MemberDTO> list = new ArrayList();
		
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
		String sql = "select * from member2";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 객체화 ok...");

		// 4. SQL문 실행 요청
//		ps.executeUpdate(); => c, u, d만! 
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 실행 요청 ok...");
		int totalRow = 0;
		while (rs.next()) {
			totalRow = rs.getRow();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			MemberDTO dto = new MemberDTO();
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);
			
			list.add(dto);
		}
		System.out.println("전체 row개수: " + totalRow);
		return list; // 묶어서 보냄.
	}

	public MemberDTO select(String sid) throws Exception {
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
		String sql = "select * from member2 where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);

		System.out.println("3. SQL문 객체화 ok...");

		// 4. SQL문 실행 요청
//		ps.executeUpdate(); => c, u, d만! 
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 실행 요청 ok...");

		MemberDTO dto = new MemberDTO();
		if (rs.next()) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);
		}
//		return id, pw, name, tel; //불가능
		return dto; // 묶어서 보냄.
	}

	public void insert(MemberDTO dto) throws Exception {
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
		String sql = "insert into member2 values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());

		System.out.println("3. SQL문 객체화 ok...");

		// 4. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 실행 요청 ok...");
	}
}
