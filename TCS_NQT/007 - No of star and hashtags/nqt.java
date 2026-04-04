import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int hashtagCount = 0;
    int starCount = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == '#') {
        hashtagCount++;
      } else if (ch == '*') {
        starCount++;
      }
    }

    System.out.println(starCount - hashtagCount);
  }
}