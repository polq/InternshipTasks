package exceptions.division;

import exceptions.division.DivisionHandler;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class DivisionTest {

  DivisionHandler handler;
  int output;

  @Before
  public void init() {
    handler = new DivisionHandler();
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionByZero() {
    output = handler.divideInts("1", "0");
  }

  @Test(expected = InputMismatchException.class)
  public void testInvalidNumbers() {
    output = handler.divideInts("23", "ss");
  }

  @Test
  public void testDivision() {
    output = handler.divideInts("23", "3");
    assertEquals(7, output);
  }
}
