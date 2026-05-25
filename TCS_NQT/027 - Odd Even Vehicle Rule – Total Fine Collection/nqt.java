import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vehicles:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter vehicle numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter date:");
        int d = sc.nextInt();
        System.out.println("Enter fine amount:");
        int fine = sc.nextInt();

        int totalFine = 0;
        for (int i = 0; i < n; i++) {
            if ((d % 2 == 0 && arr[i] % 2 != 0) ||
                (d % 2 != 0 && arr[i] % 2 == 0)) {

                totalFine += fine;
            }
        }

        System.out.println("Total fine collected: " + totalFine);
    }
}
