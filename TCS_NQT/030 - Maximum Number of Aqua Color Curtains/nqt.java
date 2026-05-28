import java.util.*;

public class Main
{
    public static int maxAqua(String s, int l){
        int maxi = 0;

        int n = s.length();

        for(int i = 0; i < n; i += l){
            int cnt = 0;

            for(int j = i; j < i + l && j < n; j++){
                if(s.charAt(j) == 'a'){
                    cnt++;
                }
            }

            maxi = Math.max(maxi, cnt);
        }

        return maxi;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int l = sc.nextInt();

        int ans = maxAqua(s, l);

        System.out.println(ans);
    }
}
