package exceptions.mycalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

  Operations operations;
  int output;

  @Before
  public void init() {
    operations = new Operations();
  }

  @Test(expected = Exception.class)
  public void testZero() throws Exception {
    output = operations.power(0, 0);
  }

  @Test(expected = Exception.class)
  public void testNegative() throws Exception {
    output = operations.power(-1, 2);
  }

  @Test
  public void testPower() throws Exception {
    output = operations.power(2, 4);
    assertEquals(16, output);
    output = operations.power(10, 0);
    assertEquals(1, output);
  }
}
