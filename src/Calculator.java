import java.util.ArrayList;
import java.util.List;

public class Calculator {
	@SuppressWarnings("serial")
	static List<BinaryExpression> binaries = new ArrayList<BinaryExpression>(){{
		add(new Sum());add(new Sub());add(new Multiply());add(new Divide());
	}};
	
	public static double eval(String expression) {
		for(BinaryExpression ex : binaries){
			if(expression.contains(ex.symbol)){
				return evaluateBinaryOperand(expression, ex);
			}
		}
		return Double.parseDouble(expression);
	}

	private static double evaluateBinaryOperand(String expression,
			BinaryExpression ex) {
		String[] operands = expression.split("\\"+ex.symbol);
		return ex.eval(eval(operands[0]),eval(operands[1]));
	}
}

abstract class BinaryExpression{
	String symbol;
	abstract double eval(double op1, double op2);
}

class Sum extends BinaryExpression{
	public Sum() {	symbol = "+";	}
	double eval(double op1, double op2) {	return op1 + op2;	}
}

class Sub extends BinaryExpression{
	public Sub() {	symbol = "-";	}
	double eval(double op1, double op2) {	return op1 - op2;	}
}

class Multiply extends BinaryExpression{
	public Multiply() {	symbol = "*";	}
	double eval(double op1, double op2) {	return op1 * op2;	}
}

class Divide extends BinaryExpression{
	public Divide() {	symbol = "/";	}
	double eval(double op1, double op2) {	return op1 / op2;	}
}