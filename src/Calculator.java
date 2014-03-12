public class Calculator {

	public static double eval(String expression) {
		if(expression.contains("+")){
			String[] operands = expression.split("\\+");
			return eval(operands[0])+eval(operands[1]);
		}else if(expression.contains("-")){
			String[] operands = expression.split("\\-");
			return eval(operands[0])-eval(operands[1]);
		}else if(expression.contains("*")){
			String[] operands = expression.split("\\*");
			return eval(operands[0])*eval(operands[1]);
		}else if(expression.contains("/")){
			String[] operands = expression.split("\\/");
			return eval(operands[0])/eval(operands[1]);
		} else {
			return Double.parseDouble(expression);
		}
	}

}


abstract class BinaryExpression{
	String symbol;
	
	abstract float eval(float op1, float op2);
}

class Sum extends BinaryExpression{
	public Sum() {	symbol = "+";	}
	float eval(float op1, float op2) {	return op1 +op2;	}
}