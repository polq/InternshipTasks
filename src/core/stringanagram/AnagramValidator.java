package core.stringanagram;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramValidator {

  private static final int MIN_STRING_LENGTH = 1;
  private static final int MAX_STRING_LENGTH = 50;

  private boolean checkAnagramCharacters(String first, String second) {

    if (first.length() != second.length()) {
      return false;
    }

    Map<String, Long> firstStringLetters =
        Arrays.stream(first.toLowerCase().split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    Map<String, Long> secondStringLetters =
        Arrays.stream(second.toLowerCase().split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    return firstStringLetters.equals(secondStringLetters);
  }

  public String areAnagrams(String first, String second) {

    if (first == null || second == null) {
      throw new NullPointerException("Invalid input, either of provided strings is null");
    }

    if (first.length() < MIN_STRING_LENGTH
        || first.length() > MAX_STRING_LENGTH
        || second.length() < MIN_STRING_LENGTH
        || second.length() > MAX_STRING_LENGTH) {
      throw new IllegalArgumentException("Input string should be of length from 1 to 50 inclusive");
    }

    return checkAnagramCharacters(first, second) ? "Anagrams" : "Not Anagrams";
  }
}
