package com.mega.mvc37;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductFinalController{
	
	@Autowired
	ProductFinalDAO productFinalDAO;
	
	@RequestMapping("insertPage")
	public void insertPage() throws Exception {
	}
	
	@RequestMapping("insert")
	public String insert(ProductFinalDTO productFinalDTO) throws Exception {
		productFinalDAO.insert(productFinalDTO);
		return "list";
	}
	
	@RequestMapping("update")
	public String update(ProductFinalDTO productFinalDTO) throws Exception {
		productFinalDAO.update(productFinalDTO);
		return "list";
	}
	
	@RequestMapping("delete")
	public String delete(ProductFinalDTO productFinalDTO) throws Exception {
		productFinalDAO.delete(productFinalDTO);
		return "list";
	}
	
	@RequestMapping("select")
	public void select(ProductFinalDTO productFinalDTO, Model model) throws Exception {
		productFinalDTO = productFinalDAO.select(productFinalDTO);
		model.addAttribute("productFinalDTO",productFinalDTO);
	}
	
	@RequestMapping("list")
	public void list(Model model) throws Exception {
		List<ProductFinalDTO> list = productFinalDAO.selectAll();
		model.addAttribute("list",list);
	}
	
}
