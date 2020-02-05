package core.stringintro;

public class BasicStringOperations {

  public void inputValidation(String firstString, String secondString) {
    if (firstString == null || secondString == null) {
      throw new NullPointerException("Either of passed string arguments is null");
    }
  }

  public int lengthOfStrings(String firstString, String secondString) {
    inputValidation(firstString, secondString);

    return firstString.length() + secondString.length();
  }

  public String lexicographicalComparison(String firstString, String secondString) {
    inputValidation(firstString, secondString);

    return firstString.compareTo(secondString) > 0 ? "Yes" : "No";
  }

  public String firstLetterCapitalizer(String firstString, String secondString) {
    inputValidation(firstString, secondString);

    char firstStringFirstChar = Character.toUpperCase(firstString.charAt(0));
    char secondStringFirstChar = Character.toUpperCase(secondString.charAt(0));

    firstString = firstStringFirstChar + firstString.substring(1);
    secondString = secondStringFirstChar + secondString.substring(1);

    return firstString + " " + secondString;
  }

  public String mainOutput(String firstString, String secondString) {
    StringBuilder builder = new StringBuilder();

    builder.append(lengthOfStrings(firstString, secondString));
    builder.append("\n");
    builder.append(lexicographicalComparison(firstString, secondString));
    builder.append("\n");
    builder.append(firstLetterCapitalizer(firstString, secondString));

    return builder.toString();
  }
}
