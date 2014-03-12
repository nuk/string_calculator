import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test public void returnStringsWithOnlyTheNUmber(){
		assertEquals(1.0, Calculator.eval("1"),0);
		assertEquals(25.0, Calculator.eval("25"),0);
	}
	
	@Test public void itSums(){
		assertEquals(2.0, Calculator.eval("1+1"),0);
		assertEquals(7.0, Calculator.eval("5+2"),0);
	}
	
}
