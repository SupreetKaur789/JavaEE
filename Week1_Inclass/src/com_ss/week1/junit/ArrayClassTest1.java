package com_ss.week1.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayClassTest1 {

	@Test
	public void testPass()
	{
		assertTrue(ArrayClass1.isPass(80));
		assertFalse(ArrayClass1.isPass(45));
	}
	@Test
	public void testGrade()
	{
		assertEquals('A',ArrayClass1.grade(95));
		assertEquals('B',ArrayClass1.grade(89));
		assertEquals('C',ArrayClass1.grade(70));
		assertEquals('D',ArrayClass1.grade(62));
		assertEquals('F',ArrayClass1.grade(54));
	}

}
