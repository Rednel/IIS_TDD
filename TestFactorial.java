package prFactorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void factorial0es1(){
		assertEquals(new Integer(1),new Integer(Factorial.calcular(0)));
	}
	
	@Test
	public void factorial1es1(){
		assertEquals(new Integer(1), new Integer(Factorial.calcular(1)));
	}
	
	@Test
	public void factorial2es2(){
		assertEquals(new Integer(2), new Integer(Factorial.calcular(2)));
	}
	
	@Test
	public void factorial3es6(){
		assertEquals(new Integer(6), new Integer(Factorial.calcular(3)));
	}
	
}
