public class if_else {

    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("adult");

        }

        else if (age > 13 && age < 18) {
            System.out.println("teenager");
        }

        else {
            System.out.println("not adult");
        }

    }
}