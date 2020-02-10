package collections.streams;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StreamsTest {

  StreamsHandler handler;

  @Before
  public void init() {
    handler = new StreamsHandler();
  }

  @Test
  public void testGroupingByDigit() {

    int[] input = new int[] {3, 44, 108, 8, 51, -1, -124333};

    Map<Integer, List<String>> map = handler.groupByDigitNumbers(input);

    assertEquals(3, map.size());

    assertEquals("o3 e8", map.get(1).stream().collect(Collectors.joining(" ")));
  }
}
