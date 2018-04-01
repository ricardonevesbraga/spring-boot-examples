package br.com.rnb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String restExampleMethod () {
		return "Hello Request";
	}
}
