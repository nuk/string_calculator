import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test public void returnStringsWithOnlyTheNUmber(){
		assertEquals(1.0, Calculator.eval("1"),0);
		assertEquals(25.0, Calculator.eval("25"),0);
	}
	
}
