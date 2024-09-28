import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        System.out.print("enter the temperatre: ");
        Scanner sc =new Scanner(System.in);
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("you have fever ");

        } else {
            System.out.println("you dont have fever ");
        }

    }
}
