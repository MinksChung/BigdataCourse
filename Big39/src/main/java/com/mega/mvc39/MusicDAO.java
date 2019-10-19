package com.mega.mvc39;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MusicDAO {

	// myBatis
	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(MusicDTO musicDTO) {
		myBatis.insert("music.insert", musicDTO);
	}
	
	public void update(MusicDTO musicDTO) {
		myBatis.update("music.update", musicDTO);
	}
	
	public void delete(MusicDTO musicDTO) {
		myBatis.delete("music.delete", musicDTO);
	}
	
	public MusicDTO select(MusicDTO musicDTO) {
		musicDTO = myBatis.selectOne("music.select", musicDTO);
		return musicDTO;
	}
	
	public List<MusicDTO> selectAll() {
		List<MusicDTO> list = myBatis.selectList("music.selectAll");
		return list;
	}
	
}
