package com.heroku;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	
	public String home() {
		return "index";
	}

}
