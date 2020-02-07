package core.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubArraysTest {

  SubArrayChecker checker;
  int output;

  @Before
  public void init() {
    checker = new SubArrayChecker();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBounds() {
    output = checker.getNegativeSubArrays(new int[] {});
  }

  @Test
  public void testSubArrays() {
    output = checker.getNegativeSubArrays(new int[] {1, 2, -5});
    assertEquals(3, output);
    output = checker.getNegativeSubArrays(new int[] {1, 2, -5, -2});
    assertEquals(7, output);
    output = checker.getNegativeSubArrays(new int[] {1, 2, -1});
    assertEquals(1, output);
  }

  @Test(expected = NullPointerException.class)
  public void testNull() {
    output = checker.getNegativeSubArrays(null);
  }
}
