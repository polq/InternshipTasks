package core.datetime;

import org.junit.Before;
import org.junit.Test;

import java.time.DateTimeException;

import static org.junit.Assert.*;

public class DateAndTimeTest {

  DayFinder finder;
  String output;

  @Before
  public void init() {
    finder = new DayFinder();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBounds() {
    output = finder.findDay(12, 12, 3001);
  }

  @Test
  public void testDate() {
    output = finder.findDay(2, 6, 2020);
    assertEquals("THURSDAY", output);
  }

  @Test(expected = DateTimeException.class)
  public void testInvalidDate() {
    output = finder.findDay(0, 2, 2003);
  }
}
