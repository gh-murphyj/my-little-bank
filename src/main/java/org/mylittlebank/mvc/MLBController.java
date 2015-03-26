package org.mylittlebank.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MLBController {
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("bankName", "My Little Bank");
		return "index";
	}

}
