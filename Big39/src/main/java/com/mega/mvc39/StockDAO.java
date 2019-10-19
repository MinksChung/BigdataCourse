package com.mega.mvc39;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StockDAO {

	// myBatis
	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(StockDTO stockDTO) {
		myBatis.insert("stock.insert", stockDTO);
	}
	
	public void update(StockDTO stockDTO) {
		myBatis.update("stock.update", stockDTO);
	}
	
	public void delete(StockDTO stockDTO) {
		myBatis.delete("stock.delete", stockDTO);
	}
	
	public StockDTO select(StockDTO stockDTO) {
		stockDTO = myBatis.selectOne("stock.select", stockDTO);
		return stockDTO;
	}
	
	public List<StockDTO> selectAll() {
		List<StockDTO> list = myBatis.selectList("stock.selectAll");
		return list;
	}
	
}
