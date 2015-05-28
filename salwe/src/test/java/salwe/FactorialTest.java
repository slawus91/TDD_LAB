package salwe;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class FactorialTest {
	
	@Rule 
	public ExpectedException thrown= ExpectedException.none();

	@Test
	public void testFactorial_for1_result1(){
		int result = Factorial.count(1);
		assertEquals(1, result);
	}
	
	@Test
	public void testFactorial_for0_result1(){
		int result = Factorial.count(0);
		assertEquals(1, result);
	}
	
	@Test
	public void testFactorial_for2_result2(){
		int result = Factorial.count(2);
		assertEquals(2, result);
	}
	
	@Test
	public void testFactorial_for4_result24(){
		int result = Factorial.count(4);
		assertEquals(24, result);
	}
	
	@Test
	public void testFactorial_forBelowZero_Exception(){
		thrown.expect(UnderZeroException.class);
		Factorial.count(-2);
	}
}
