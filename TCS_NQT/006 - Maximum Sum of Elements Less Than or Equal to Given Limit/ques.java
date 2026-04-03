import java.util.*;

public class ques {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int maxSum = sc.nextInt();

    System.out.println(solve(arr, 0, 0, maxSum));
  }

  static int solve(int[] arr, int i, int currentSum, int maxSum) {
    // If sum exceeds, invalid path
    if (currentSum > maxSum)
      return 0;

    // If all elements considered
    if (i == arr.length)
      return currentSum;

    // Include current element
    int include = solve(arr, i + 1, currentSum + arr[i], maxSum);

    // Exclude current element
    int exclude = solve(arr, i + 1, currentSum, maxSum);

    return Math.max(include, exclude);
  }

}

// TC = O(2^n)
// SC = O(n)