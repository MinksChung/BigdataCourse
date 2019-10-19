package com.mega.mvc02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	public void insert(BbsDTO dto) throws Exception {
		
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();

		String sql = "insert into bbs2 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());

		ps.execute();
		
		ps.close();
		con.close();

	}
	
	public BbsDTO select(BbsDTO dto) throws Exception {

		// 2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2. DB연결 ok..");

		// 3) SQL문 객체화
		String sql = "select * from bbs2 where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		System.out.println("3. sql문 객체화 ok..");

		// 4) SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok..");

		while (rs.next()) {
			dto = new BbsDTO();
			// ORM (object:자바 rdb:table항목 mapping)
			dto.setId(rs.getString(1));
			dto.setTitle(rs.getString(2));
			dto.setContent(rs.getString(3));
			dto.setWriter(rs.getString(4));
		}

		rs.close();
		ps.close();
		con.close();

		return dto;
		
	}
	
	public ArrayList<BbsDTO> selectAll() throws Exception {

		ArrayList<BbsDTO> list = new ArrayList();
		
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();

		String sql = "select * from bbs2";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			BbsDTO dto = new BbsDTO();
			
			dto.setId(rs.getString(1));
			dto.setTitle(rs.getString(2));
			dto.setContent(rs.getString(3));
			dto.setWriter(rs.getString(4));
			
			list.add(dto);
		}

		rs.close();
		ps.close();
		con.close();

		return list;
		
	}
	
}
