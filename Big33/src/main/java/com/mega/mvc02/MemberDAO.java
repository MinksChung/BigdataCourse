package com.mega.mvc02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public MemberDTO select(MemberDTO dto) throws Exception {

		// 2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2. DB연결 ok..");

		// 3) SQL문 객체화
		String sql = "select * from member2 where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		System.out.println("3. sql문 객체화 ok..");

		// 4) SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok..");

		while (rs.next()) {
			dto = new MemberDTO();
			// ORM (object:자바 rdb:table항목 mapping)
			dto.setId(rs.getString(1));
			dto.setPw(rs.getString(2));
			dto.setName(rs.getString(3));
			dto.setTel(rs.getString(4));
		}

		rs.close();
		ps.close();
		con.close();

		return dto;
		
	}
	
	public ArrayList<MemberDTO> selectAll() throws Exception {

		ArrayList<MemberDTO> list = new ArrayList();
		
		// 2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2. DB연결 ok..");

		// 3) SQL문 객체화
		String sql = "select * from member2";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 객체화 ok..");

		// 4) SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok..");

		while (rs.next()) {
			MemberDTO dto = new MemberDTO();
			// ORM (object:자바 rdb:table항목 mapping)
			dto.setId(rs.getString(1));
			dto.setPw(rs.getString(2));
			dto.setName(rs.getString(3));
			dto.setTel(rs.getString(4));
			
			list.add(dto);
		}

		rs.close();
		ps.close();
		con.close();

		return list;
		
	}

}
