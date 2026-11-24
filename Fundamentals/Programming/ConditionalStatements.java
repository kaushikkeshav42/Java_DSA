import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // If Conditional Statement : -

        System.out.println("Demonstrating If Conditional Statement");
        System.out.println("Enter your annual Salary.");
        int sal = sc.nextInt();

        if(sal>1200000){
            System.out.println("You have to Pay Income Tax.");
        }

        // If-Else Conditional Statement : - 

        System.out.println("Demonstrating If-Else Conditional Statement");
        System.out.println("Enter your Age.");
        int age = sc.nextInt();
        if (age>=21){
            System.out.println("You can Marry to your Love.");
        }
        else{
            System.out.println("Wait for "+(21-age)+" Years to Marry your Love.");
        }

        // If else If Conditional Statement : - 

        System.out.println("Demonstrating If else If Consditional Statement");
        if (sal <= 1200000){
            System.out.println("You Need not to pay any Income Tax.");
        }
        else if(sal>120000 && sal <=2000000){
            System.out.println("You have to pay "+(sal*0.1)+" Rupees as Income Tax.");
        }
        else {
            System.out.println("You have to pay "+(sal*0.2)+" Rupees as Income Tax");
        }

        // Nested If - Else Conditional Statement

        System.out.println("Demonstrating Nested If Else Conditional Statement");
        if (age>18){
            System.out.println("You can Vote in Election.");
            if (age>21){
                System.out.println("You are independent to choose your Life Partner.");
            }
        }
        else{
            System.out.println("Wait for "+(18-age)+" to Vote in Election");
            System.out.println("Wait for "+(21-age)+" to Choose your Life Partner.");
        }

        // Switch Case Statement : -
        
        System.out.println("Enter Grade obtained");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A' -> System.out.println("Excellent! You have done Great Job.");
            case 'B' -> System.out.println("Good! Keep it Up.");
            case 'C' -> System.out.println("Nice! Work on Yourself.");
            case 'D' -> System.out.println("Poor! Seriously need to improve performance");
            default -> throw new AssertionError();
        }
        
        // Ternary Conditional Operator - ?

        System.out.println("Enter any Integer.");
        int x = sc.nextInt(); 
        System.out.println(x >= 0 ? "X is Positive." : "x is Negative");


        // Nested Ternary Operator 

        System.out.println("Enter any Integer.");
        int y = sc.nextInt();
        System.out.println(y > 0 ? "Y is positive Integer."
                                 : (x < 0 ? "Y is negative Integer."
                                          : "Y is Zero."
                                 )
        );
    }
}
