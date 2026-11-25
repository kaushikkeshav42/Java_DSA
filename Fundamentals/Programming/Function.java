
import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Built in functions
        System.out.println("Enter any Number.");
        int a = sc.nextInt();
        System.out.println("Result is " + Math.sqrt(a));

        // User Defined Function.
        System.out.println("Enter any two numbers");
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum = " + (b + c) + "\nDifference = " + (b > c ? (b - c) : (c - b))
                + "\nProduct = " + (b * c) + "\nQuotient = " + (c != 0 ? (b / c) : "c = 0 Division is not possible"));
    }
}
