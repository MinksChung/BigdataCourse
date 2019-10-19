package com.mega.mvc36;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController{
	
	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) throws Exception {
		memberDAO.insert(memberDTO);
	}
	
	@RequestMapping("update")
	public void update(MemberDTO memberDTO) throws Exception {
		memberDAO.update(memberDTO);
	}
	
	@RequestMapping("delete")
	public void delete(MemberDTO memberDTO) throws Exception {
		memberDAO.delete(memberDTO);
	}
	
	@RequestMapping("select")
	public void select(MemberDTO memberDTO, Model model) throws Exception {
		memberDTO = memberDAO.select(memberDTO);
		model.addAttribute("memberDTO",memberDTO);
	}
	
	@RequestMapping("selectAll")
	public String selectAll(Model model) throws Exception {
		List<MemberDTO> list = memberDAO.selectAll();
		/*
		 * for (MemberDTO memberDTO : list) { System.out.println(memberDTO.getId()); }
		 */
		model.addAttribute("list",list);
		return "all";
	}
	
	@RequestMapping("idCheck")
	public String idCheck(MemberDTO memberDTO) {
		String id = "root";
		String result = null;
		if(id.equals(memberDTO.getId())) {
			result = "all";
		}else {
			result = "redirect:/";
		}
		return result;
	}
	
	@RequestMapping("idCheck2")
	public String idCheck2(MemberDTO memberDTO) {
		String id = "root";
		String result = null;
		if(id.equals(memberDTO.getId())) {
			result = "ok";
		}else {
			result = "not";
		}
		return result;
	}
	
	@RequestMapping("json")
	@ResponseBody
	public MemberDTO jsonCall() {
		MemberDTO dto = new MemberDTO();
		dto.setId("success1");
		dto.setPw("success2");
		dto.setName("success3");
		dto.setTel("success4");
		return dto;
	}
	
	@RequestMapping("jsonList")
	@ResponseBody
	public ArrayList<MemberDTO> jsonListCall() {
		ArrayList<MemberDTO> list = new ArrayList();
		MemberDTO dto = new MemberDTO();
		dto.setId("success1");
		dto.setPw("success2");
		dto.setName("success3");
		dto.setTel("success4");
		list.add(dto);
		dto = new MemberDTO();
		dto.setId("Realsuccess1");
		dto.setPw("Realsuccess2");
		dto.setName("Realsuccess3");
		dto.setTel("Realsuccess4");
		list.add(dto);
		return list;
	}
	
}
