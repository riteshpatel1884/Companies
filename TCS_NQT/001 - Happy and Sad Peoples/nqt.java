import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();

    double happy = N;
    double sad = 0;

    for (int i = 0; i < 4; i++) {
      double newHappy = 0.3 * happy + 0.5 * sad;
      double newSad = 0.7 * happy + 0.5 * sad;

      happy = newHappy;
      sad = newSad;
    }

    System.out.println(happy + " " + sad);
  }
}
