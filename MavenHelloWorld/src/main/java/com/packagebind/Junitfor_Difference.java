package com.packagebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junitfor_Difference {

	@Test
	public final void test() {
		Difference d = new Difference();
		
		assertEquals(2,d.sub(5,3));
	}

}
