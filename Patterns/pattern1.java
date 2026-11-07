import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows to create a Pattern.");
        int n = scanner.nextInt();
            // Variable declaration and Initialization.
            
        printPattern1(n);
            // printPatter(n) - Function Call.
            
        printPattern2(n);
        printPattern3(n);
        printPattern4(n);
        printPattern5(n);
        printPattern6(n);
        printPattern7(n);
        printPattern8(n);
        printPattern9(n);
        printPattern10(n);
    
    }

    public static void printPattern1(int n){
        // Function Declaration.

        System.out.println("Pattern 1");
        System.out.println();

        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.print(i+"\t"); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }
        
        System.out.println();
        System.out.println();

    }

    public static void printPattern2(int n){
        // Function Declaration.

        System.out.println("Pattern 2");
        System.out.println();

        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.printf("%5d", i); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }

        System.out.println();
        System.out.println();

    }

    public static void printPattern3(int n){
        // Function Declaration.

        System.out.println("Pattern 3");
        System.out.println();

        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.printf("%5d", i%2); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern4(int n){
        // Function Declaration.
        System.out.println("Pattern 4");
        System.out.println();
        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.printf("%5d", (i+1)%2); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern5(int n){
        // Function Declaration.

        System.out.println("Pattern 5");
        System.out.println();

        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.printf("%5d", j); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern6(int n){
        // Function Declaration.

        System.out.println("Pattern 6");
        System.out.println();

        for(int i=1; i<=n; i++){ 
            // Outer Loop is responsible for Creation and Deciding No. of Rows.

            for(int j=1; j<=n; j++){ 
                // Inner Loop is responsible for Creation and Deciding No. of Columns.

                System.out.printf("%5d", j%2); 
                // System.out.print() - Keep the cursor in same Line.
            
            }
            System.out.println();
            // System.out.println() - Move Cursor to next Line.
        
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern7(int n){
        System.out.println("Pattern 7");
        System.out.println();

        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(k+"\t");
                if(i%2==0 && j<n){
                    k-=1;
                }
                else{
                    if(j<n){
                        k+=1;
                    }
                }
            }
            k+=n;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern8(int n){
        System.out.println("Pattern 8");
        System.out.println();

        int k=n*n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(k+"\t");
                if(i%2==0 && j<n){
                    k+=1;
                }
                else{
                    if(j<n){
                        k-=1;
                    }
                }
            }
            k-=n;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern9(int n){
        System.out.println("Pattern 9");
        System.out.println();

        int l=1;
        int m=9;
        for(int i=1; i<=n; i++){
            int k=i;
            for(int j=1; j<=n; j++){
                System.out.print(k+"\t");
                if(j%2==0){
                    k+=l;
                }
                else{
                    k+=m;
                }
            }
            l+=2;
            m-=2;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern10(int n){
        System.out.println("Pattern 10");
        System.out.println();

        int l=1;
        int m=9;
        for(int i=1; i<=n; i++){
            int k=n*n-i+1;
            for(int j=1; j<=n; j++){
                System.out.print(k+"\t");
                if(j%2==0){
                    k-=l;
                }
                else{
                    k-=m;
                }
            }
            l+=2;
            m-=2;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    
}