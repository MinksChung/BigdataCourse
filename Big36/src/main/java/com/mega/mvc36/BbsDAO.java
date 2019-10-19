package com.mega.mvc36;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	public List<BbsDTO> selectAll() throws Exception {
		
		List<BbsDTO> list = myBatis.selectList("bbs.selectAll");
		return list;

	}

}
