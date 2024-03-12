package project.calculator;

import java.util.logging.Logger;

public class App {
	
	private static final Logger LOGGER = Logger.getLogger(App.class.getName()); 
	public static void main(String[] args)

	{
		boolean isContinue = true;
		Input input = new Input();

		while (isContinue) {

			LOGGER.info("Welcome to the Calculator program!");

			int first = input.getFirstNumber();
			int second = input.getSecondNumber();
			char operation = input.getOperation();

			Calculator c1 = new Calculator();
			

			switch (operation) {

			case 'a':
				c1.add(first, second);
				break;
			case 's':
				c1.subtract(first, second);
				break;
			case 'm':
				c1.multiply(first, second);
				break;
			case 'd':
				c1.divide(first, second);
				break;
			default:
				LOGGER.warning("Incorrect input of operation. Try again!");

			}

			char start = input.getContinueOption();

			if (start == 'e') {
				LOGGER.info("Exiting...");
				LOGGER.info("Thank you!");
				isContinue = false;
			} else {
				isContinue = true;
			}

		}

	}
	
}
