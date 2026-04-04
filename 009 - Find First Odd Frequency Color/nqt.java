import java.util.*;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    char[] arr = new char[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.next().charAt(0);
    }

    HashMap<Character, Integer> map = new HashMap<>();

    // count frequency
    for (char ch : arr) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    // find first odd frequency
    for (char ch : arr) {
      if (map.get(ch) % 2 != 0) {
        System.out.println(ch);
        return;
      }
    }

    System.out.println("All are even");
  }
}


// map.getOrDefault(ch, 0)
// If ch exists in map then it return its value otherwise return 0
// map = {a=2, b=1}
// map.getOrDefault('a', 0) → 2  
// map.getOrDefault('c', 0) → 0


// +1 will increment count
// 2+1=3 0+1= 1

// map.put(ch,result)

// Store updated value back into map
