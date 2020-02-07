package core.arrays;

import java.util.Arrays;

public class SubArrayChecker {

  private static final int MIN_ARRAY_LENGTH = 1;
  private static final int MAX_ARRAY_LENGTH = 100;

  public int getNegativeSubArrays(int[] inputNumbers) {

    if (inputNumbers == null) {
      throw new NullPointerException("Invalid null argument");
    }

    if (inputNumbers.length < MIN_ARRAY_LENGTH || inputNumbers.length > MAX_ARRAY_LENGTH) {
      throw new IllegalArgumentException("Input number count must be of range from 1 to 100");
    }

    int negativeSubsCount = 0;
    for (int i = 0; i < inputNumbers.length; i++) {
      for (int j = i; j < inputNumbers.length; j++) {
        int[] subArray = Arrays.copyOfRange(inputNumbers, i, j + 1);
        if (Arrays.stream(subArray).sum() < 0) {
          negativeSubsCount++;
        }
      }
    }

    return negativeSubsCount;
  }
}
