import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test public void returnStringsWithOnlyTheNUmber(){
		assertEquals(1.0, Calculator.eval("1"),0);
		assertEquals(2.0, Calculator.eval("2"),0);
	}
	
}
