package com.cen4802.module7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
	@Test
	public void testAddition()
	{
		Calculator addingMachine = new Calculator();
		assertEquals(5, addingMachine.addition(2,  3));
	}
	
	@Test
	public void testSubtraction()
	{
		Calculator TI86 = new Calculator();
		assertEquals(7, TI86.subtraction(10,  3));
	}
	
	@Test
	public void testMultiplication()
	{
		Calculator scientific = new Calculator();
		assertEquals(60, scientific.multiply(6,  10));
	}
	
	@Test
	public void testDivision()
	{
		Calculator eniac = new Calculator();
		assertEquals(3, eniac.divide(21,  7), 3);
	}
}
