package com.mega.mvc03;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
// 주요한 ㅍ로그램 제어(객체 생성 등)를 스프링이 해줌.
// 제어의 역행(Inversion of Control: IoC)
	
	// 스프링이 타입에 해당하는 객체를 찾아서 주소주입
	// 의존성주입(Dependency Injection: DI)
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
	
	public ArrayList<MemberDTO> selectAll() throws Exception {

		return null;
		
	}


}
