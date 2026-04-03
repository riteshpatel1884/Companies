import java.util.Scanner;

public class nqt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hrs =sc.nextInt();
    double fine;
    if(hrs<=2) fine = 100;
    else if(hrs> 2 && hrs<= 5) fine = 50;
    else fine = 20;
    
    System.out.println("Fine is: " + fine);
  }
}
