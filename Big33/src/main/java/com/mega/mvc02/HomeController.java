package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public void home() {
		System.out.println("컨트롤러 호출");
	}
	@RequestMapping("member")
	public void member() {
		System.out.println("회원가입 처리");
	}
	
}
