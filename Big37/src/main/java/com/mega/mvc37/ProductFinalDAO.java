package com.mega.mvc37;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductFinalDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	public void insert(ProductFinalDTO dto) throws Exception {

		myBatis.insert("productFinal.insert", dto);

	}
	
	public void update(ProductFinalDTO dto) throws Exception {
		
		myBatis.update("productFinal.update", dto);
		
	}
	
	public void delete(ProductFinalDTO dto) throws Exception {

		myBatis.delete("productFinal.delete", dto);

	}

	public ProductFinalDTO select(ProductFinalDTO dto) throws Exception {

		dto = myBatis.selectOne("productFinal.select", dto);
		return dto;
		
	}
	
	public List<ProductFinalDTO> selectAll() throws Exception {

		List<ProductFinalDTO> list = myBatis.selectList("productFinal.selectAll");
		return list;
		
	}


}
