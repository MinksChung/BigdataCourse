package com.mega.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController{
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("start")
	public void start() {
		
	}
	
	@RequestMapping("insert")
	public void insert(ProductDTO productDTO) throws Exception {
		productDAO.insert(productDTO);
	}
	
	@RequestMapping("update")
	public void update(ProductDTO productDTO) throws Exception {
		productDAO.update(productDTO);
	}
	
	@RequestMapping("delete")
	public void delete(ProductDTO productDTO) throws Exception {
		productDAO.delete(productDTO);
	}
	
	@RequestMapping("select")
	public void select(ProductDTO productDTO, Model model) throws Exception {
		productDTO = productDAO.select(productDTO);
		model.addAttribute("productDTO",productDTO);
	}
	
}
