package com.eduardo.web.demo3.helloeduardo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEduardoController {

	@GetMapping (path = "/hello-eduardo-bean")
	public HelloEduardoBean helloEduardoController() {
		return new HelloEduardoBean("What's up!");
	}
	
	@GetMapping (path = "/hello-eduardo-bean/path-variable/{someString}")
	public HelloEduardoBean helloEduardoController(@PathVariable String someString) {
		return new HelloEduardoBean(String.format("Hello Eduardo, %s", someString));
	}
	
	
}
