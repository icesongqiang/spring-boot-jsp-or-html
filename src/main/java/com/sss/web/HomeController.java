
package com.sss.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
public class HomeController{
	@RequestMapping("/hello")
	@ResponseBody
	public String index(){
		return "hello, Chapter3.2";
	}
	
	@RequestMapping("/html")
	public String indexHtml(ModelMap map){
		map.addAttribute("host", "localhost:8080");
		return "indexHtml";
	}
	
	@RequestMapping("/jsp")
	public String indexJsp(Model model){
		model.addAttribute("host", "hhhh");
		return "indexJsp";
	}
	
}
