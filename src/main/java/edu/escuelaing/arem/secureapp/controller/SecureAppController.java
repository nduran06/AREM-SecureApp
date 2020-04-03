package edu.escuelaing.arem.secureapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/secclient")
public class SecureAppController {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	Environment env;

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		return "First Method";
	}

	

}
