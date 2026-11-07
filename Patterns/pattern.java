import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number to create the pattern.");
        int n = scanner.nextInt();

        printPattern1(n);
        printPattern2(n);
        printPattern3(n);
        printPattern4(n);
        scanner.close();
    }

    public static void printPattern1(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Patter!!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 1");
            System.out.println();

            int end = 1;
            for(int i=1; i<=n; i++){
                for(int j = 1; j<=n; j++){
                    if(j<=end){
                        System.out.print("* ");
                    }
                }
                if(i<(n/2)+1){
                    end +=1;
                }
                else{
                    end-=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern2(int n){

        System.out.println("Pattern 2");
        System.out.println();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(j >= i){   
                    System.out.print("* ");
                }

                else{
                    System.out.print("  ");
                }

            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern3(int n){

        System.out.println("Pattern 2");
        System.out.println();

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print("* ");

            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern4(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Patter!!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 4");
            System.out.println();

            int end = (n/2)+1;
            for(int i=1; i<=n; i++){
                for(int j = 1; j<=(n/2)+1; j++){
                    if(j>=end){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                if(i<(n/2)+1){
                    end -=1;
                }
                else{
                    end+=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }


}