import java.util.Scanner;

public class Main {

    static final long MOD = 100000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books/students:");
        int n = sc.nextInt();

        long[] derangement = new long[n + 1];

        derangement[0] = 1;

        if (n >= 1)
            derangement[1] = 0;

        for (int i = 2; i <= n; i++) {
            derangement[i] =
                ((i - 1) * (derangement[i - 1] + derangement[i - 2])) % MOD;
        }

        System.out.println("Possible exchanges: " + derangement[n]);
    }
}
