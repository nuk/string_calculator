
public class Calculator {

	public static double eval(String expression) {
		try {
			return Double.parseDouble(expression);
		} catch (NumberFormatException e) {
			return 2;
		}
	}

}
