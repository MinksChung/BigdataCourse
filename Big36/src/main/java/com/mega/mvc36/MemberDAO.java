package com.mega.mvc36;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	public void insert(MemberDTO dto) throws Exception {

		myBatis.insert("member.insert", dto);

	}
	
	public void update(MemberDTO dto) throws Exception {
		
		myBatis.update("member.update", dto);
		
	}
	
	public void delete(MemberDTO dto) throws Exception {

		myBatis.delete("member.delete", dto);

	}

	public MemberDTO select(MemberDTO dto) throws Exception {
		
		dto = myBatis.selectOne("member.select", dto);
		return dto;
		
	}
	
	public List<MemberDTO> selectAll() throws Exception {
		
		List<MemberDTO> list = myBatis.selectList("member.selectAll");
		return list;
		
	}


}
