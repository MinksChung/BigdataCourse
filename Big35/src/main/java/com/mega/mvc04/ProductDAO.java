package com.mega.mvc04;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	public void insert(ProductDTO dto) throws Exception {

		myBatis.insert("product.insert", dto);

	}
	
	public void update(ProductDTO dto) throws Exception {
		
		myBatis.update("product.update", dto);
		
	}
	
	public void delete(ProductDTO dto) throws Exception {

		myBatis.delete("product.delete", dto);

	}

	public ProductDTO select(ProductDTO dto) throws Exception {

		dto = myBatis.selectOne("product.select", dto);
		return dto;
		
	}
	
	public ArrayList<ProductDTO> selectAll() throws Exception {

		return null;
		
	}


}
