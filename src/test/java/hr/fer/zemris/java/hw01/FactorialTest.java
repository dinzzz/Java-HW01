package hr.fer.zemris.java.hw01;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
	
	@Test
	public void regularNumber() {
		Assert.assertEquals(24, Factorial.faktorijela(4));
	}
	
	@Test
	public void zero() {
		Assert.assertEquals(1, Factorial.faktorijela(0));
	}
}
