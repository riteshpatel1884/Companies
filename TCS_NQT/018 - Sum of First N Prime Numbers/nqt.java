import java.util.*;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;
    int num = 2;
    int sum = 0;

    while (count < N) {
      if (isPrime(num)) {
        sum += num;
        count++;
      }
      num++;
    }

    System.out.println(sum);
  }

  public static boolean isPrime(int num) {
    if (num < 2)
      return false;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }
}