import java.util.*;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // monkeys
    int m = sc.nextInt(); // bananas
    int p = sc.nextInt(); // peanuts
    int k = sc.nextInt(); // bananas per monkey
    int j = sc.nextInt(); // peanuts per monkey

    // calculate monkeys fed by bananas
    int bananaMonkeys = m / k;
    int rem_banana = m % k;
    
    // calculate monkeys fed by peanuts
    int peanutMonkeys = p / j;
    int rem_peanuts = p % j;

    int totalFed = bananaMonkeys + peanutMonkeys;
    int remaining = n - totalFed;  

    if (rem_banana!=0 || rem_peanuts!=0)
      remaining = remaining-1;

    System.out.println(remaining);
  }
}

// n = 10   → total monkeys  
// k = 4    → bananas per monkey  
// j = 3    → peanuts per monkey  
// m = 14   → total bananas  
// p = 9    → total peanuts  

// Each monkey needs 4 bananas: 14 / 4 = 3 
// 3 monkeys eat → 12 bananas so remaining 14 % 4 = 2
// Remaining bananas = 2

// Each monkey needs 3 peanuts: 9 / 3 = 3
// No remainder as 9 % 3 = 0
// No extra monkey

// total monkey can eat = 3 + 3 = 6 
// and 2 banana are left and as it is less than 4(given in ques) so the next monkey will eat whatever is left so 6 + 1 = 7.

// So remaining monkeys who did not eat anything = 10 - 7 = 3 ans