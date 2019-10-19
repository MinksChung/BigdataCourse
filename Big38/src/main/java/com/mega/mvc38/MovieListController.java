package com.mega.mvc38;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieListController{
	
	/* dao는 싱글톤으로 사용하기 위해 autowired */
	@Autowired
	MovieListDAO movieListDAO;
	
	/* requestMapping으로 폼태그 또는 하이퍼링크로 액션이 있을 때 그 액션을 받아서 아래 메서드 실행 후 반환 */
	@RequestMapping("insertPage")
	public void insertPage() throws Exception {
	}
	
	/* insert메서드 실행 */ 
	@RequestMapping("insert")
	public String insert(MovieListDTO movieListDTO) throws Exception {
		movieListDAO.insert(movieListDTO);
		/* 실행 후 list로 이동 */
		return "redirect:list";
	}
	
	/* update메서드 실행 */ 
	@RequestMapping("update")
	public String update(MovieListDTO movieListDTO) throws Exception {
		movieListDAO.update(movieListDTO);
		return "redirect:list";
	}
	
	/* delete메서드 실행 */ 
	@RequestMapping("delete")
	public String delete(MovieListDTO movieListDTO) throws Exception {
		movieListDAO.delete(movieListDTO);
		return "redirect:list";
	}
	
	/* select메서드 실행 */ 
	@RequestMapping("select")
	public void select(MovieListDTO movieListDTO, Model model) throws Exception {
		movieListDTO = movieListDAO.select(movieListDTO);
		model.addAttribute("movieListDTO",movieListDTO);
	}
	
	/* selectAll메서드 실행 */ 
	@RequestMapping("list")
	public void list(Model model) throws Exception {
		List<MovieListDTO> list = movieListDAO.selectAll();
		model.addAttribute("list",list);
	}
	
}
