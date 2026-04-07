import java.util.*;

public class nqt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t> 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            
            int sum = p + q + r;
            
            // Check possibility
            if (sum % 3 != 0) {
                System.out.println(-1);
                continue;
            }
            
            int target = sum / 3;
            
            int ops = (Math.abs(p - target) 
                     + Math.abs(q - target) 
                     + Math.abs(r - target)) / 2;
            
            System.out.println(ops);
        }
    }
}