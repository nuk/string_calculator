import java.util.ArrayList;
import java.util.List;

public class Calculator {

	static List<BinaryExpression> binaries = new ArrayList<BinaryExpression>(){{
		add(new Sum());add(new Sub());add(new Multiply());add(new Divide());
	}};
	
	public static double eval(String expression) {
		
		for(BinaryExpression ex : binaries){
			if(expression.contains(ex.symbol)){
				String[] operands = expression.split("\\+");
				return ex.eval(eval(operands[0]),eval(operands[1]));
			}
		}
		
		/*if(expression.contains("+")){
			String[] operands = expression.split("\\+");
			return eval(operands[0])+eval(operands[1]);
		}else*/ /*if(expression.contains("-")){
			String[] operands = expression.split("\\-");
			return eval(operands[0])-eval(operands[1]);
		}else*/ if(expression.contains("*")){
			String[] operands = expression.split("\\*");
			return eval(operands[0])*eval(operands[1]);
		}else if(expression.contains("/")){
			String[] operands = expression.split("\\/");
			return eval(operands[0])/eval(operands[1]);
		} else {
			return Double.parseDouble(expression);
		}
//		return Double.parseDouble(expression);
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