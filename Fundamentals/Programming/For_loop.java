import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Basic For loop
        System.out.println("Enter any Number.");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.print(i+"\t");
        }
        
        // For each loop 
        int [] nums = {1,2,3,5,4,6,7};
        for (int num : nums){
            System.out.print(num+" ");
        }
        

        // For Loop with Multiple Variables
        System.out.println("Enter any Number");
        int b = sc.nextInt();
        for(int i=0 ; i<5 && b>10; i++,b--){
            System.out.println("i = "+i+" ,b = "+b);
        }
        
       // infinite for loop 
       // for (;;) {
        //infinite for loop 
       // }
        
       // Nested For Loop
       System.out.println("Enter any Number");
       int c = sc.nextInt();
       for (int i =1; i<=10 ; i++){
            for (int j = 1; j<=10; j++ ){
                System.out.print(j*c+" ");
            }
            System.out.println(); 
        }
        
       // For loop with step / stride
       System.out.println("Enter any number");
       int d = sc.nextInt();
       for(int i=1; i<=d; i+=2){
        System.out.print(i+" ");
       }

    }
}