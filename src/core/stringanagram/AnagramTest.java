package core.stringanagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  AnagramValidator validator;
  String output;

  @Before
  public void init() {
    validator = new AnagramValidator();
  }

  @Test(expected = NullPointerException.class)
  public void testNull() {
    output = validator.areAnagrams(null, "Something");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLowerBound() {
    output = validator.areAnagrams("", "test");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testUpperBound() {
    output =
        validator.areAnagrams(
            "test", "12345678912345678912345663423423423423423423423423423423423423");
  }

  @Test
  public void testAnagram() {
    output = validator.areAnagrams("test", "tset");
    assertEquals("Anagrams", output);
  }

  @Test
  public void testNotAnagram() {
    output = validator.areAnagrams("test", "tess");
    assertEquals("Not Anagrams", output);
  }

  @Test
  public void testCaseAnagram() {
    output = validator.areAnagrams("test", "SEtT");
    assertEquals("Anagrams", output);
  }
}
