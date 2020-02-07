package core.datetime;

import java.time.LocalDate;

public class DayFinder {

  public String findDay(int month, int day, int year) {

    if (year < 2000 || year > 3000) {
      throw new IllegalArgumentException(
          "Invalid input, the input year must be in range from 2000 to 3000 exclusive");
    }

    LocalDate date = LocalDate.of(year, month, day);
    return date.getDayOfWeek().toString();
  }
}
