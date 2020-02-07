package core.bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalComparator {

  private static final int MIN_ARRAY_LENGTH = 1;
  private static final int MAX_ARRAY_LENGTH = 200;

  public String[] compareBigDecimalString(String[] inputStrings) {

    if (inputStrings == null) {
      throw new NullPointerException("Invalid null argument");
    }

    if (inputStrings.length < MIN_ARRAY_LENGTH || inputStrings.length > MAX_ARRAY_LENGTH) {
      throw new IllegalArgumentException("Input number count must be of range from 1 to 200");
    }

    Arrays.sort(
        inputStrings,
        (numberOne, numberTwo) -> {
          BigDecimal decimalOne = new BigDecimal(numberOne);
          BigDecimal decimalTwo = new BigDecimal(numberTwo);
          return decimalTwo.compareTo(decimalOne);
        });

    return inputStrings;
  }
}
