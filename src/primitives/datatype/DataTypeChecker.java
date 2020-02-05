package primitives.datatype;

public class DataTypeChecker {

  public String checkInputNumber(String input) {
    String output = "";
    try {
      long number = Long.parseLong(input);
      output += "can fit in";
      if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
        output += " * byte";
      }

      if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
        output += " * short";
      }

      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        output += " * int";
      }

      output += " * long";

    } catch (NumberFormatException e) {
      output = "can't be fitted anywhere.";
    }

    return output;
  }
}
