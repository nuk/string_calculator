public class Calculator {

	public static double eval(String expression) {
		if(expression.contains("+")){
			String[] operands = expression.split("\\+");
			return eval(operands[0])+eval(operands[1]);
		} else {
			return Double.parseDouble(expression);
		}
	}

}
