package core.bigdecimal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigDecTest {

  BigDecimalComparator comparator;
  String[] output;

  @Before
  public void init() {
    comparator = new BigDecimalComparator();
  }

  @Test
  public void testComparator() {
    output = comparator.compareBigDecimalString(new String[] {"0.1", ".1", "10", "-1.0", "-1"});
    assertArrayEquals(new String[] {"10", "0.1", ".1", "-1.0", "-1"}, output);
  }

  @Test(expected = NumberFormatException.class)
  public void testInvalidInput() {
    output = comparator.compareBigDecimalString(new String[] {"sss", "0.1"});
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBounds() {
    output = comparator.compareBigDecimalString(new String[] {});
  }

  @Test(expected = NullPointerException.class)
  public void testNullValue() {
    output = comparator.compareBigDecimalString(null);
  }
}
