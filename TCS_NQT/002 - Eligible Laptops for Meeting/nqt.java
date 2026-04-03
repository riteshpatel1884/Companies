import java.util.Scanner;

public class nqt {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    int count = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] > N)
        count++;
    }

    System.out.println("No of laptops: " + count);
  }
}
