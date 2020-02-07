package exceptions.division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionHandler {

  public int divideInts(String firstInput, String secondInput) {
    if (firstInput == null || secondInput == null) {
      throw new NullPointerException("Invalid null arguments");
    }

    int firstInt;
    int secondInt;
    try {
      firstInt = Integer.parseInt(firstInput);
      secondInt = Integer.parseInt(secondInput);
    } catch (NumberFormatException e) {
      throw new InputMismatchException("Invalid arguments, input must be of type Integer");
    }

    if (secondInt == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }

    return firstInt / secondInt;
  }
}
