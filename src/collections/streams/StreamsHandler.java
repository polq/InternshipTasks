package collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsHandler {

  public Map<Integer, List<String>> groupByDigitNumbers(int[] input) {
    Map<Integer, List<String>> resultMap;
    resultMap =
        Arrays.stream(input)
            .boxed()
            .filter(number -> number > 0)
            .collect(
                Collectors.groupingBy(
                    number -> String.valueOf(number).length(),
                    Collectors.mapping(
                        number ->
                            number % 2 == 0
                                ? String.valueOf("e" + number)
                                : String.valueOf("o" + number),
                        Collectors.toList())));

    return resultMap;
  }
}
