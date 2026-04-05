import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int R = sc.nextInt();
    int C = sc.nextInt();
    int[][] parking = new int[R][C];

    for(int i=0;i<R;i++){
      for(int j=0;j<C;j++){
        parking[i][j] = sc.nextInt();
      }
    }
    int maxCount = 0;
    int rowIndex = -1;

    for (int i = 0; i < R; i++) {
      int count = 0;

      for (int j = 0; j < C; j++) {
        if (parking[i][j] == 1)
          count++;
      }

      if (count > maxCount) {
        maxCount = count;
        rowIndex = i;
      }
    }

    // +1 because problem uses 1-based indexing
    System.out.println(rowIndex + 1);
  }
}
