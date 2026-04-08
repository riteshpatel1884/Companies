import java.util.*;

public class nqt {
  public static void main(String[] args) {

    String str = "223334566777";

    if (str == null || str.length() == 0) {
      System.out.println("");
      return;
    }

    StringBuilder result = new StringBuilder();

    // Add first character
    result.append(str.charAt(0));

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(i - 1)) {
        result.append(str.charAt(i));
      }
    }

    System.out.println(result.toString()); // Output: 234567
  }
}