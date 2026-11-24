package Java_DSA.Fundamentals.Programming;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter your age, height, grade, firstname and lastname : ");
        int age = sc.nextInt();
        float height = sc.nextFloat();
        char grade = sc.next().charAt(0);
        String firstname = sc.next();
        String lastname = sc.next();
        String name = firstname+" "+lastname;

        System.out.println("Your age: "+age);
        System.out.println("Your height: "+height);
        System.out.println("Your grade: "+grade);
        System.out.println("Your name: "+name);
    }
}