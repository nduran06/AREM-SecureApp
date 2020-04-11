package edu.escuelaing.arem.secure.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class SecureClientController {

	/**
	 * Hello result
	 * @param name Name of an user
	 * @return Hello + name or Hello + World if a name was not given
	 */
	@RequestMapping("hello")
	public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello "+name+"!!";
	}
	
	
	/**
	 * Not found page
	 * @return HTTP status Not Found
	 */
	@RequestMapping("notFound")
	public HttpStatus notFound() {
		return HttpStatus.NOT_FOUND;
	}

}
