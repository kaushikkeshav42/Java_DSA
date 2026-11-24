package Java_DSA.Fundamentals.Programming;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Basic For loop
        System.out.println("Enter any Number.");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.print("i\t");
        }
    }
}