package com.proj2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Alpha 
{
	@RequestMapping("/page")
	public String page()
	{
		return "index";
	}
	

}
