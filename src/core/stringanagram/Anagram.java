package core.stringanagram;

import core.stringintro.StringIntroTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Anagram {

  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(AnagramTest.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
}
