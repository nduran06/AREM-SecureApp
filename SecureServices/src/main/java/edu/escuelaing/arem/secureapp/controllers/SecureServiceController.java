package edu.escuelaing.arem.secureapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.escuelaing.arem.secureapp.services.MathServices;

@RestController
@RequestMapping(value = "math")

public class SecureServiceController {
	
	@Autowired
	private MathServices mathServices;
	
	/**
	 * Method to get the square number of a given number
	 * @param number Client number
	 * @return Response entity with the result
	 */
	@GetMapping(value = "/square")
	public ResponseEntity<?> getSquare(@RequestParam String number){
		try {
			double doubleNumber=Double.parseDouble(number);
			return new ResponseEntity<>(this.mathServices.getSquare(doubleNumber), HttpStatus.ACCEPTED);       
		}
		catch(Exception e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
