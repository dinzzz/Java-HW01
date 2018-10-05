package hr.fer.zemris.java.hw01;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
	
	@Test
	public void perimeterTest() {
		Assert.assertEquals(10, Rectangle.opseg(2,3), 0);
	}
	
	@Test
	public void areaTest() {
		Assert.assertEquals(12, Rectangle.povrsina(4, 3), 0);
	}

}
