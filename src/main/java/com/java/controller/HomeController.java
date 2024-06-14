package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 화면처리 annotation
public class HomeController {

	@GetMapping("/") // doGet(); 메소드와 같다.
	public String home(Model model) {
		model.addAttribute("txt", "전송 데이터");
		return "home"; // "파일명".jsp파일 리턴
	}
	
	@GetMapping("/form")
	public String form() {
		return "Form"; // views에 Form.jsp파일 리턴
	}
	
	@PostMapping("/result")
	public String result(Model model, @RequestParam("cnt") int cnt, @RequestParam("txt") String txt) {
			
		
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("txt", txt);
		
		return "Result"; // views에 Result.jsp파일 리턴
		
	}
	
}
