// https://youtu.be/mvTT-ikC5AQ?si=88Lp8y962JXpNN8A&t=421

import java.util.*;

public class Main
{
    public static void move_zero_end(int arr[]){
        int n = arr.length;

        // first zero index
        int j = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        // no zero present
        if(j == -1){
            return;
        }

        // move zeros to end
        for(int i = j + 1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        move_zero_end(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
