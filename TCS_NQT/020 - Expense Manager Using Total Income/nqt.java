import java.util.*;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int income = sc.nextInt();
    sc.nextLine();

    Map<String, Integer> map = new HashMap<>();
    int totalExpense = 0;

    while (true) {
      String category = sc.nextLine();

      if (category.equalsIgnoreCase("done"))
        break;

      if (!sc.hasNextInt()) {
        System.out.println("Invalid input. Expected number.");
        break;
      }

      int expense = sc.nextInt();
      sc.nextLine();

      totalExpense += expense;
      map.put(category, map.getOrDefault(category, 0) + expense);
    }

    int savings = income - totalExpense;

    System.out.println("Total Income: " + income);
    System.out.println("Total Expenses: " + totalExpense);
    System.out.println("Total Savings: " + savings);

    for (String key : map.keySet()) {
      System.out.println(key + ": " + map.get(key));
    }
  }
}