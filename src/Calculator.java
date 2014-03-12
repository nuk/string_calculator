public class Calculator {

	public static double eval(String expression) {
		if(expression.contains("+")){
			String[] parts = expression.split("\+");
			return Double.parseDouble(parts[0])+Double.parseDouble(parts[1]);
		} else {
			return Double.parseDouble(expression);
		}
	}

}
