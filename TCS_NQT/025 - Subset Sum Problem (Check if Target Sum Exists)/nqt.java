public class nqt {

  public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 2 };
    int target = 10;

    if (subsetSum(arr, arr.length, target)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static boolean subsetSum(int[] arr, int n, int target) {
    // Base cases
    if (target == 0)
      return true;
    if (n == 0)
      return false;

    // If current element > target, skip it
    if (arr[n - 1] > target) {
      return subsetSum(arr, n - 1, target);
    }

    // Include OR exclude
    return subsetSum(arr, n - 1, target) || subsetSum(arr, n - 1, target - arr[n - 1]);
  }

}

// https://youtu.be/HJ2imDJxkhc?si=aD1eNJkFp3LjlI38&t=18309