package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {

	
	@RequestMapping("/r")
	@ResponseBody
	public String wqw() 
	{
		
		return"hello";
	}
	

}
