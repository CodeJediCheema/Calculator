package project.calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Input {
	
	private static final Logger LOGGER = Logger.getLogger(Input.class.getName());
	

	private Scanner userInput;

	public Input() {
		userInput = new Scanner(System.in);
	}

	public int getFirstNumber() {
		LOGGER.info("Enter First Number: ");
		return userInput.nextInt();
	}

	public int getSecondNumber() {
		LOGGER.info("Enter Second Number: ");
		return userInput.nextInt();
	}

	public char getOperation() {
		LOGGER.info("Enter the opertion you want to perform: ");
		LOGGER.info("Type A for Addition");
		LOGGER.info("Type S for Subtraction");
		LOGGER.info("Type D for Division");
		LOGGER.info("Type M for Multiplication");
		return Character.toLowerCase(userInput.next().charAt(0));
	}

	public char getContinueOption() {

		LOGGER.info("Press E to EXIT, To continue press any key");
		return Character.toLowerCase(userInput.next().charAt(0));

	}

}
