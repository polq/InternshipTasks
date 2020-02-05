package primitives.datatype;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataTypeTest {

  DataTypeChecker checker = new DataTypeChecker();
  String output;
  String number;

  @Test
  public void testByte() {
    number = "1";
    output = checker.checkInputNumber(number);
    assertEquals(
        output, number + " can fit in: \n" + " * byte\n" + " * short\n" + " * int\n" + " * long");
  }

  @Test
  public void testShort() {
    number = "-129";
    output = checker.checkInputNumber(number);
    assertEquals(output, number + " can fit in: \n" + " * short\n" + " * int\n" + " * long");
  }

  @Test
  public void testInt() {
    number = "-33000";
    output = checker.checkInputNumber(number);
    assertEquals(output, number + " can fit in: \n" + " * int\n" + " * long");
  }

  @Test
  public void testLong() {
    number = "3423423423323";
    output = checker.checkInputNumber(number);
    assertEquals(output, number + " can fit in: \n * long");
  }

  @Test
  public void testLargerThanLong() {
    number = "2312312321321321332322321";
    output = checker.checkInputNumber(number);
    assertEquals(output, number + " can't be fitted anywhere.");
  }

  @Test
  public void testString() {
    number = "34234234233s";
    output = checker.checkInputNumber(number);
    assertEquals(output, number + " can't be fitted anywhere.");
  }

  @Test
  public void testNull() {
    number = null;
    output = checker.checkInputNumber(number);
    assertEquals(output, number + " can't be fitted anywhere.");
  }
}
