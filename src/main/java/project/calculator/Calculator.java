package project.calculator;

import java.util.logging.Logger;

public class Calculator {
	
	private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
	
		
	public int add(int a, int b) {
		int result = a+b;
		LOGGER.info(Constants.MESSAGE + result);
		return result;
	}
	
	public int subtract(int a, int b) {
		int result = a-b;
		LOGGER.info(Constants.MESSAGE + result);
		return result;
	}
	
	public int multiply(int a, int b) {
		int result = a*b;
		LOGGER.info(Constants.MESSAGE + result);
		return result;
	}
	
	public float divide(int a, int b) {
		float result = (float) a/b;
		LOGGER.info(Constants.MESSAGE + result);
		return result;
		 
	}

}
