package edu.escuelaing.arem.secureapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/nt-ms")

public class SecureServerController {
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		return "Hello from NT-MS; First Method";
	}

}
