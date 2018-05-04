package test.reggie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import reggie.org.car.Tesla;

public class testTesla {

	@Test
	public void test1() {
		Tesla t = new Tesla("reggie","homehome",300.0);
		assertEquals(3000 ,t.marketPublic(),0);
	}
	
	@Test
	public void test2() {
		Tesla t = new Tesla("reggie","homehome",300.0);
		assertEquals(true ,t.dismiss());
	}

}
