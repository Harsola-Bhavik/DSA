import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        System.out.print("enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year%100!=0 && year%4==0 || year%400==0 ) {
            System.out.println("this is a leap year ");
        }
        else {
            System.out.println("this is not a leap year ");
        }
    }
}
