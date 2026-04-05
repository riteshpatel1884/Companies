import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int days = sc.nextInt();

    Map<String, Integer> dayMap = new HashMap<>();
    dayMap.put("monday", 6);
    dayMap.put("tuesday", 5);
    dayMap.put("wednesday", 4);
    dayMap.put("thursday", 3);
    dayMap.put("friday", 2);
    dayMap.put("saturday", 1);
    dayMap.put("sunday", 0);

    int ans = 0;

    if (days - dayMap.get(s) > 1) {  // 13 - 6 = 7>1
      ans = 1 + (days - dayMap.get(s)) / 7;   // 1 + ishliye kiya kyuki 6 me s 1 din sunday hoga
    }

    System.out.println(ans);

  }
}


// Day Mapping (Key → Value)
// Day	Value
// Mon	6       means mondey ke 6 din baad sunday aayega
// Tue	5       means tues ke 5 din baad sunday aayega
// Wed	4       ""
// Thu	3       ""
// Fri	2       ""
// Sat	1       ""
// Sun	0       means aaj hi sunday hai

// store it as key value pair

// so if input is 13 then and its mondey then 13 - 6 = 7 so jab 13 me se 6 ko minus kiya then hamne 1 sunday mil gya and remaining 7 days bacha so 7/7 = 1 sunday so total = 2 sunday