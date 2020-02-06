package primitives.controlflow;

public class WeirdNumberChecker {

  public String isNumberWeird(int inputNumber) {
    String output = "Not Weird";
    if (inputNumber < 1 || inputNumber > 100) {
      throw new IllegalArgumentException("inputNumber must be in range from 1 to 100 inclusive");
    }
    if (inputNumber % 2 == 1) {
      output = "Weird";
    } else if (inputNumber <= 5) {
      output = "Not Weird";
    } else if (inputNumber <= 20) {
      output = "Weird";
    }

    return output;
  }
}
