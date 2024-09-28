import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        System.out.print("enter the marks: ");
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        String val = (marks >= 33) ? "pass" : "fail";
        System.out.println(val);
    }
}
