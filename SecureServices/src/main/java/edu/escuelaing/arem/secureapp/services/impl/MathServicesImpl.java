package edu.escuelaing.arem.secureapp.services.impl;

import org.springframework.stereotype.Service;

import edu.escuelaing.arem.secureapp.services.MathServices;

@Service
public class MathServicesImpl implements MathServices{

	@Override
	public double getSquare(double number) {
		return number*number;
	}

}
