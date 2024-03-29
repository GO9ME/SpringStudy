package com.springStudy.app;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ctrl+shift+o 자동 임포트 
public class RegisterController {
	@RequestMapping(value="/register/add", method=RequestMethod.GET) // 신규회원 가입
	//@GetMapping("/register/add") // 4.3부터 추가
	public String register() {
		return "registerForm";  // WEB-INF/views/registerForm.jsp
	}
	
	@RequestMapping(value="/register/save", method=RequestMethod.POST) // 신규회원 가입
// 	@PostMapping("/register/save")
//	@PostMapping("/register/add")
	public String save(@ModelAttribute("user") User user, Model m) throws UnsupportedEncodingException {
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못입력하셨습니다.", "utf-8");
			
			m.addAttribute("msg", msg);
			return "redirect:/register/add"; // 신규회원 가입화면으로 이동(redirect)
		}
		
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
	}
	
}
