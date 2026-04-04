import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int count = 1; 
    int maxSoFar = arr[0];

    for (int i = 1; i < n; i++) {
      if (arr[i] > maxSoFar) {
        count++;
        maxSoFar = arr[i];
      }
    }

    System.out.println(count);
  }
}