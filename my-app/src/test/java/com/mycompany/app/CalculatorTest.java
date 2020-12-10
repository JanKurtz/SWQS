package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() {
        calc=new Calculator();
    }

    @Test
    public void testAddition()
    {
        assertEquals(2, calc.addition(-2, 4));
    }

    @Test
    public void testnegativAddition(){
        assertEquals(-6, calc.addition(-2, -4));
    }

    @Test
    public void testSubtraction(){
        assertEquals(3, calc.subtraction(5, 2));
    }

    @Test
    public void testnegativSubtraction(){
        assertEquals(-3, calc.subtraction(-5, -2));
    }

    @Test
    public void testMultiplication(){
        assertEquals(12, calc.multiplication(4, 3));
    }

    @Test
    public void testnegativMultiplication(){
        assertEquals(-12, calc.multiplication(-4, 3));
    }

    @Test
    public void testDivision(){
        assertEquals(5, calc.division(15, 3));
    }

    @Test
    public void testnegativDivision(){
        assertEquals(-5, calc.division(-15, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDivision() {
        calc.division(4, 0);
    }

    @After
    public void tearDown() throws Exception {
        calc=null;
    }
}
