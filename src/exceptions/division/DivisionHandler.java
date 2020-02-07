package exceptions.division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionHandler {

  public String divideInts(String firstInput, String secondInput) {
    String inputStream = String.join(" ", firstInput, secondInput);
    Scanner scanner = new Scanner(inputStream);
    try {
      int firstInt = scanner.nextInt();
      int secondInt = scanner.nextInt();
      return String.valueOf(firstInt / secondInt);
    } catch (InputMismatchException e) {
      return e.toString();
    } catch (ArithmeticException e) {
      return e.toString();
    }
  }
}
