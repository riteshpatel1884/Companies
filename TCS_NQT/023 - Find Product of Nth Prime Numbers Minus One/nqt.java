import java.util.*;

public class nqt {

  public static void main(String[] args) {

    int n1 = 4;
    int n2 = 5;

    int prime1 = getNthPrime(n1);
    int prime2 = getNthPrime(n2);

    long result = (long) prime1 * prime2 - 1;

    System.out.println(result); // Output: 76
  }

  // Function to get nth prime
  public static int getNthPrime(int n) {
    int count = 0;
    int num = 1;

    while (count < n) {
      num++;
      if (isPrime(num)) {
        count++;
      }
    }
    return num;
  }

  // Function to check if a number is prime
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