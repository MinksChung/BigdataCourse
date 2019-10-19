package com.mega.mvc03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	public void bbsInsert(BbsDTO dto) throws Exception {

		myBatis.insert("bbs.bbsInsert", dto);
		
	}

	public void bbsUpdate(BbsDTO dto) throws Exception {

		myBatis.update("bbs.bbsUpdate", dto);
		
	}

	public void bbsDelete(BbsDTO dto) throws Exception {

		myBatis.delete("bbs.bbsDelete", dto);
		
	}

	public BbsDTO select(BbsDTO dto) throws Exception {

		dto = myBatis.selectOne("bbs.bbsSelect", dto);
		return dto;

	}

	public ArrayList<BbsDTO> selectAll() throws Exception {

		return null;

	}

}
