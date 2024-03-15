package com.LMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/get")
	public String getValue() {
		return "i need permission today at 4:30 and i am leave on tommorrow";
	}

}
