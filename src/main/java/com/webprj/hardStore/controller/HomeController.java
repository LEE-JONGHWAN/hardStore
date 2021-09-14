package com.webprj.hardStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	    @RequestMapping
	    public String home(Model model) {
	        model.addAttribute("welcomeMsg", "우리 인터넷 하드 전문 스토어 홈페이지 방문을 환영합니다.");
	        model.addAttribute("sellItems", "판매 품목: 다양한 하드디스크");
	        return "hardHome";
	    }
}
