package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.testDAO;

@Controller
public class testController {
	@GetMapping("/index")
	public String index(Model model) throws Exception{
		
		 Map<String, String> indexMap = new HashMap<String, String>();
		 indexMap.put("test", "test111"); 
		 model.addAttribute("testModel", indexMap);
		 String indexStr = "index 페이지 잘 들어왔습니다."; 
		 model.addAttribute("index",indexStr);
		 
		
		testDAO user = new testDAO("aa","test","web");
		model.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping("/vueTest")
	public String vueTest(Model model) throws Exception {
		
		Map<String, String> fruitmap = new HashMap<String, String>();
		fruitmap.put("fruit1", "apple");
		fruitmap.put("fruit2", "banana");
		fruitmap.put("fruit3", "orange");
//		modelAndView.addObject("fruit", fruitmap);
		model.addAttribute("fruit", fruitmap);
		
		return "vueTest";
	}

}
