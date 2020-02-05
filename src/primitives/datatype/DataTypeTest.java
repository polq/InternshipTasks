package primitives.datatype;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataTypeTest {

  DataTypeChecker checker = new DataTypeChecker();
  String output;

  @Test
  public void testByte() {
    output = checker.checkInputNumber("1");
    assertEquals(output, "can fit in * byte * short * int * long");
  }

  @Test
  public void testShort() {
    output = checker.checkInputNumber("-128");
    assertEquals(output, "can fit in * short * int * long");
  }

  @Test
  public void testInt() {
    output = checker.checkInputNumber("-33000");
    assertEquals(output, "can fit in * int * long");
  }

  @Test
  public void testLong() {
    output = checker.checkInputNumber("3423423423323");
    assertEquals(output, "can fit in * long");
  }

  @Test
  public void testString() {
    output = checker.checkInputNumber("34234234233s");
    assertEquals(output, "can't be fitted anywhere.");
  }

  @Test
  public void testNull() {
    output = checker.checkInputNumber(null);
    assertEquals(output, "can't be fitted anywhere.");
  }
}
