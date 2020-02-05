package primitives.controlflow;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ControlFlowTest {

  WeirdNumberChecker checker;
  String output;

  @Before
  public void init() {
    checker = new WeirdNumberChecker();
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkLowerBounds() {
    output = checker.isNumberWeird(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkUpperBound() {
    output = checker.isNumberWeird(102);
  }

  @Test
  public void checkOdd() {
    new Random()
        .ints(20, 1, 101)
        .filter(number -> number % 2 != 0)
        .forEach(number -> assertEquals(checker.isNumberWeird(number), "Weird"));
  }

  @Test
  public void checkLowEven() {
    output = checker.isNumberWeird(2);
    assertEquals(output, "Not Weird");
    output = checker.isNumberWeird(4);
    assertEquals(output, "Not Weird");
  }

  @Test
  public void checkEvenUnderTwenty() {
    output = checker.isNumberWeird(12);
    assertEquals(output, "Weird");
  }

  @Test
  public void checkEvenLargerThanTwenty() {
    new Random()
        .ints(20, 21, 101)
        .filter(number -> number % 2 == 0)
        .forEach(number -> assertEquals("Not Weird", checker.isNumberWeird(number)));
  }
}
