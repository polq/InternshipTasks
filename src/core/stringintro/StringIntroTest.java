package core.stringintro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIntroTest {

  BasicStringOperations basicStringOperations;
  String stringOutput;
  int intOutput;

  @Before
  public void init() {
    basicStringOperations = new BasicStringOperations();
  }

  @Test(expected = NullPointerException.class)
  public void testNullInput() {
    basicStringOperations.mainOutput(null, "s");
  }

  @Test
  public void testLength() {
    intOutput = basicStringOperations.lengthOfStrings("hello", "java");
    assertEquals(9, intOutput);
  }

  @Test
  public void testLexic() {
    stringOutput = basicStringOperations.lexicographicalComparison("hello", "java");
    assertEquals("No", stringOutput);
  }

  @Test
  public void testCapitalizer() {
    stringOutput = basicStringOperations.firstLetterCapitalizer("hello", "java");
    assertEquals("Hello Java", stringOutput);
  }

  @Test
  public void testOverallOutput() {
    stringOutput = basicStringOperations.mainOutput("zero", "test");
    assertEquals("8\nYes\nZero Test", stringOutput);
  }
}
