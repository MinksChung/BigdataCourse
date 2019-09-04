package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDAO {

	public void insert(MemberDTO dto) throws Exception {
		
		// 2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
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
