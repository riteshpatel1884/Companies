import java.util.*;

public class nqt {
  public static void main(String[] args) {
    String str = "swissmississippi"; //ws

    if (str == null || str.length() == 0) {
      System.out.println("Invalid Input");
      return;
    }

    // Frequency map
    Map<Character, Integer> freq = new LinkedHashMap<>();

    for (char c : str.toCharArray()) {
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }

    // 1. First non-repeating character
    Character nonRepeating = null;
    for (char c : str.toCharArray()) {
      if (freq.get(c) == 1) {
        nonRepeating = c;
        break;
      }
    }

    // 2. Most frequent character (tie → first occurrence)
    int maxFreq = 0;
    Character mostFrequent = null;

    for (char c : str.toCharArray()) {
      int count = freq.get(c);
      if (count > maxFreq) {
        maxFreq = count;
        mostFrequent = c;
      }
    }

    // Output logic
    if (nonRepeating == null) {
      System.out.println("None " + mostFrequent);
    } else {
      System.out.println("" + nonRepeating + mostFrequent);
    }
  }
}