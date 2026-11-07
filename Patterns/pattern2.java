import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any Number to Create a Pattern.");
        int n= scanner.nextInt();
        // Variable declaration and Initialization.
        
        printPattern1(n);
        // printPatter(n) - Function Call.

        scanner.close();
    }

    public static void printPattern1(int n){
        // Function Declaration.

        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.print("("+i+","+j+")\t"); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }
    }

}
