import java.util.*;

public class nqt {

  public static void main(String[] args) {

    int[] nums = { 1, 2, 3 };
    int X = 10, Y = 30;

    int result = countValidPairs(nums, X, Y);
    System.out.println(result); // Output: 4
  }

  // Function to count valid pairs
  public static int countValidPairs(int[] nums, int X, int Y) {
    int n = nums.length;
    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        if (i == j)
          continue; // skip same index

        // Concatenate numbers
        String concatStr = "" + nums[i] + nums[j];
        long value = Long.parseLong(concatStr);

        // Check range
        if (value >= X && value <= Y) {
          count++;
        }
      }
    }

    return count;
  }

}