import java.util.Arrays;
import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] str = new String[n];
    String prefix = "";
    for (int i = 0; i < n; i++) {
      str[i] = sc.next();
    }

    Arrays.sort(str); // strs = ["flight","flow", "flower"]
    // We will check common preix in 1st and last string so jo common 1st and last
    // me hoga wahi uske beech wale sare strings me bhi hoga since they are sorted

    String first = str[0];
    String last  = str[n-1];
    for (int i = 0; i < n; i++) {
      if (first.charAt(i) == last.charAt(i)) {
        prefix += first.charAt(i);
      } else {
        break;  // Once characters don’t match, you should stop immediately
      }
    }
    System.out.println(prefix);
  }
}
