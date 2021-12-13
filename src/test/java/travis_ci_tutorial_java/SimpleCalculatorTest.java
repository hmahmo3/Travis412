package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	//testing add
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.add(0, 2), 2);
		assertEquals(calc.add(1, 3), 4);
		assertEquals(calc.add(2, 2), 4);
		assertEquals(calc.add(0, 4), 4);
	}
	
	//testing minus
	@Test public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
		assertEquals(calc.minus(5, 4), 1);
		assertEquals(calc.minus(5, 5), 0);
		assertEquals(calc.minus(4, 3), 1);
		assertEquals(calc.minus(4, 2), 2);
	}
	
	//testing multi
	@Test public void testMulti() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multi(2, 1), 2);
		assertEquals(calc.multi(2, 2), 4);
		assertEquals(calc.multi(1, 1), 1);
		assertEquals(calc.multi(3, 1), 3);
		assertEquals(calc.multi(2, 3), 6);
	}
	
	//testing div
	@Test public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(4, 2), 2);
		assertEquals(calc.div(4, 4), 1);
		assertEquals(calc.div(4, 1), 4);
		assertEquals(calc.div(6, 2), 3);
		assertEquals(calc.div(6, 3), 2);
	}
}
