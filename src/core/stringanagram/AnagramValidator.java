package core.stringanagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramValidator {

  private static final int MIN_STRING_LENGTH = 1;
  private static final int MAX_STRING_LENGTH = 50;

  private boolean checkAnagramCharacters(String first, String second) {

    if (first.length() != second.length()) {
      return false;
    }

    first = first.toLowerCase();
    second = second.toLowerCase();

    Map<Character, Integer> firstStringLetters = new HashMap<>();
    Map<Character, Integer> secondStringLetters = new HashMap<>();

    first
        .chars()
        .forEach(
            chars ->
                firstStringLetters.put(
                    (char) chars, firstStringLetters.getOrDefault((char) chars, 0) + 1));

    second
        .chars()
        .forEach(
            chars ->
                secondStringLetters.put(
                    (char) chars, secondStringLetters.getOrDefault((char) chars, 0) + 1));

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
