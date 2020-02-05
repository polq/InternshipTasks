package primitives.datatype;

public class DataTypeChecker {

  public String checkInputNumber(String input) {
    if (input == null) {
      return "null can't be fitted anywhere.";
    }
    StringBuilder output = new StringBuilder(input);
    try {
      long number = Long.parseLong(input);
      output.append(" can fit in: ");
      if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
        output.append("\n");
        output.append(" * byte");
      }

      if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
        output.append("\n");
        output.append(" * short");
      }

      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        output.append("\n");
        output.append(" * int");
      }

      output.append("\n");
      output.append(" * long");

    } catch (NumberFormatException e) {
      output.append(" can't be fitted anywhere.");
    }

    return output.toString();
  }
}
