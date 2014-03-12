public class Calculator {

	public static double eval(String expression) {
		if(expression.contains("+")){
			String[] parts = expression.split("\\+");
			return eval(parts[0])+eval(parts[1]);
		} else {
			return Double.parseDouble(expression);
		}
	}

}
