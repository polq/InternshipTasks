package exceptions.division;

import exceptions.division.DivisionHandler;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    DivisionHandler handler;
    String output;

    @Before
    public void init(){
        handler = new DivisionHandler();
    }

    @Test
    public void testDivisionByZero(){
        output = handler.divideInts("1", "0");
        assertEquals("java.lang.ArithmeticException: / by zero", output);
    }

    @Test
    public void testInvalidNumbers(){
        output = handler.divideInts("23", "ss");
        assertEquals("java.util.InputMismatchException", output);
    }

}