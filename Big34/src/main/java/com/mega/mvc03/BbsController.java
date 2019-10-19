package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController{
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("bbsstart")
	public void bbsstart() {
		
	}
	
	@RequestMapping("bbsinsert")
	public void bbsInsert(BbsDTO bbsDTO) throws Exception {
		bbsDAO.bbsInsert(bbsDTO);
	}
	
	@RequestMapping("bbsupdate")
	public void bbsUpdate(BbsDTO bbsDTO) throws Exception {
		bbsDAO.bbsUpdate(bbsDTO);
	}
	
	@RequestMapping("bbsdelete")
	public void bbsDelete(BbsDTO bbsDTO) throws Exception {
		bbsDAO.bbsDelete(bbsDTO);
	}
	
	@RequestMapping("bbsselect")
	public void select(BbsDTO bbsDTO, Model model) throws Exception {
		bbsDTO = bbsDAO.select(bbsDTO);
		model.addAttribute("bbsDTO",bbsDTO);
	}
	
}
