package com.packt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String helloWorld(@PathVariable(value = "name") String name) {
		return "hello " + name;
	}
	
}
