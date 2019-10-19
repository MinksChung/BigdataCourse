package com.mega.mvc38;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*컨트롤러에서 싱글톤 사용하기 위해 repository지정*/
@Repository
public class MovieListDAO {

	/* 마이바티스 autowired 각 메서드에서 mapping된 sql 실행 */
	@Autowired
	SqlSessionTemplate myBatis;
	
	/* insert메서드 정의 */
	public void insert(MovieListDTO dto) throws Exception {

		myBatis.insert("movieList.insert", dto);

	}
	
	/* update메서드 정의 */
	public void update(MovieListDTO dto) throws Exception {
		
		myBatis.update("movieList.update", dto);
		
	}
	
	/* delete메서드 정의 */
	public void delete(MovieListDTO dto) throws Exception {

		myBatis.delete("movieList.delete", dto);

	}

	/* select메서드 정의 */
	public MovieListDTO select(MovieListDTO dto) throws Exception {

		dto = myBatis.selectOne("movieList.select", dto);
		return dto;
		
	}
	
	/* selectAll메서드 정의 */
	public List<MovieListDTO> selectAll() throws Exception {

		List<MovieListDTO> list = myBatis.selectList("movieList.selectAll");
		return list;
		
	}


}
