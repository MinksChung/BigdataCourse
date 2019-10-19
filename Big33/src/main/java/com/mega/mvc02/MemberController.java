package com.mega.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController{
	
	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) throws Exception {
		memberDAO.insert(memberDTO);
	}
	
	@RequestMapping("select")
	public void select(MemberDTO memberDTO, Model model) throws Exception {
		memberDTO = memberDAO.select(memberDTO);
		model.addAttribute("memberDTO",memberDTO);
	}
	
}
