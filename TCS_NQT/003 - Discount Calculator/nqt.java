import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int amt = sc.nextInt(); // 800
    double discount;

    if (amt < 1000) {
      discount = amt - 0.05 * amt;
    } else if (amt >= 1000 && amt < 5000) {
      discount = amt - 0.1 * amt;
    } else {
      discount = amt - 0.15 * amt;
    }

    System.out.println("Discount: %.2f" + discount); // wrong output: %.2f760.0
    System.out.printf("Discount: %.2f", discount);  // right output: 760.00
  }
}
