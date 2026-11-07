import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Odd Number of Rows to Generate a Pattern.");
        int n = sc.nextInt();
        System.out.println();
        printPattern1(n);
        printPattern2(n);
        printPattern3(n);
        printPattern4(n);
        printPattern5(n);
        printPattern6(n);
        printPattern7(n);
        printPattern8(n);
        printPattern9(n);
        printPattern10(n);
        printPattern11(n);
        printPattern12(n);
        printPattern13(n);
        sc.close();
    }

    public static void printPattern1(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 1");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print("*   ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern2(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 2");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print(i+"   ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern3(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 3");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print(i%2+"   ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern4(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 4");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                int k=1;
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print(k+"   ");
                        k+=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern5(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 5");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                int k=1;
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print(k%2+"   ");
                        k+=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern6(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 6");
            System.out.println();

            int start = 1;
            int k=1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.printf("%-4d", k);
                        k+=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern7(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 7");
            System.out.println();

            int start = 1;
            int k=n*3;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.printf("%-4d", k);
                        k-=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern8(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 8");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print((char)(i+64)+"   ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern9(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 9");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                int k=1;
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print((char)(k+64)+"   ");
                        k+=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern10(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 10");
            System.out.println();

            int start = 1;
            int k=1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print((char)(k+64)+"   ");
                        k+=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern11(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 11");
            System.out.println();

            int start = 1;
            int k=n*3;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print((char)(k+64)+"   ");
                        k-=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern12(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 12");
            System.out.println();

            int start = 1;
            int k=n;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print((char)(k+64)+"   ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                k-=1;
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern13(int n){
        if(n%2 == 0){
            System.out.println("Failed to Generate Pattern !!! \nEnter Odd Number of Rows.");
        }

        else{
            System.out.println("Pattern 13");
            System.out.println();

            int start = 1;
            for(int i=1; i<=n; i++){
                int k = (n-start)+1;
                for(int j=1; j<=(n*2)-1; j++){
                    if(j>=start && j<=n){
                        System.out.print((char)(k+64)+"   ");
                        k-=1;
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                start+=1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    
}