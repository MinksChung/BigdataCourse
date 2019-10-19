package com.mega.mvc36;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController{
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("list")
	public void list(Model model) throws Exception {
		List<BbsDTO> list = bbsDAO.selectAll();
		/*
		 * for (BbsDTO bbsDTO : list) { System.out.println(bbsDTO.getId()); }
		 */
		model.addAttribute("list",list);
	}
	
}
