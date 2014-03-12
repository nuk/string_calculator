
public class Calculator {

	public static double eval(String expression) {
		if(expression.contains("+")){
			
			return Double.parseDouble(expression);
		} catch (NumberFormatException e) {
			return 2;
		}
	}

}
