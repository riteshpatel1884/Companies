import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long i = sc.nextLong();
    long j = sc.nextLong();

    // Handle if i > j
    if (i > j) {
      long temp = i;
      i = j;
      j = temp;
    }

    // handle constraint if j > 9999
    if(j>9999){
      System.out.println("Invalid value of j");
    }

    long n = j - i + 1;  // This calculates how many numbers are in the range [i, j]

    long sum = n * (i + j) / 2; // This is based on the AP sum formula

    System.out.println(sum);
  }
}
