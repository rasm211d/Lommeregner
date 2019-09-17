import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lommeregner lommeregner = new Lommeregner();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Enter operator between 1 to 5: ");
        int op = input.nextInt();

        if (op == 1) {
            System.out.println("You entered the operator +");
            System.out.println(lommeregner.sum(a,b));
        } else if (op == 2) {
            System.out.println("You entered the operator -");
            System.out.println(lommeregner.minus(a,b));
        } else if (op == 3) {
            System.out.println("You entered the operator *");
            System.out.println(lommeregner.gange(a,b));
        } else if (op == 4) {
            System.out.println("You entered the operator /");
            System.out.println(lommeregner.dividere(a,b));
        } else if (op == 5) {
            System.out.println("You want a secret operator");
            System.out.println(lommeregner.secret(a,b));
        } else {
            System.out.println("WRONG INPUT");
        }

    }
}
