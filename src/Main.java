import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.printf("Enter a: ");
        a = input.nextInt();
        System.out.printf("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
             else
                b = b - a;
        }
        System.out.printf("Greatest common factor: " + b);
    }
}