import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number to create the pattern.");
        int n = scanner.nextInt();

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
        printPattern14(n);
        printPattern15(n);
        printPattern16(n);
        printPattern17(n);
        printPattern18(n);
        printPattern19(n);
        printPattern20(n);
        printPattern21(n);
        printPattern22(n);
        printPattern23(n);
        printPattern24(n);
        printPattern25(n);
        printPattern26(n);
        printPattern27(n);
        printPattern28(n);
        printPattern29(n);
        printPattern30(n);
        printPattern31(n);
        scanner.close();
    }

    public static void printPattern1(int n){

        System.out.println("Pattern 1");
        System.out.println();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print("* ");

            }

            System.out.println();

        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern2(int n){

        System.out.println("Pattern 2");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%-4d",i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern3(int n){

        System.out.println("Pattern 3");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%-4d", i%2);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern4(int n){

        System.out.println("Pattern 4");
        System.out.println();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%-4d", j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }
    
    public static void printPattern5(int n){

        System.out.println("Pattern 5");
        System.out.println();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%-4d", j%2);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern6(int n){

        System.out.println("Pattern 6");
        System.out.println();

        for (int i=n; i>=1; i--){
            for (int j=n; j>=i; j--){
                System.out.printf("%-4d", j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern7(int n){

        System.out.println("Pattern 7");
        System.out.println();

        for (int i=n; i>=1; i--){
            for (int j=n; j>=i; j--){
                System.out.printf("%-4d", i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern8(int n){

        System.out.println("Pattern 8");
        System.out.println();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%-4d", j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern9(int n){

        System.out.println("Pattern 9");
        System.out.println();

        for (int i=1; i<=n; i++){
            int k = i;
            for (int j=1; j<=i; j++){
                System.out.printf("%-4d", k);
                k= k-1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void printPattern10(int n){

        System.out.println("Pattern 10");
        System.out.println();

        int k=1;
        int l=1;
        for(int i=1 ; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.printf("%-4d", k);
                k-=1;                
            }
            l+=i+1;
            k=l;
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }

    public static void printPattern11(int n){

        System.out.println("Pattern 11");
        System.out.println();

        int k=n*3;
        int l=n*3;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%-4d", k);
                k-=1;
            }
            l-=i;
            k=l;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern12(int n){
        System.out.println("Pattern 12");
        System.out.println();
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(k+64)+" ");
                k+=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern13(int n){
        System.out.println("Pattern 13");
        System.out.println();
        int k=n*3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(k+64)+" ");
                k-=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern14(int n){
        System.out.println("Pattern 14");
        System.out.println();
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(k+64)+" ");
            }
            k+=1;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern15(int n){
        System.out.println("Pattern 15");
        System.out.println();
        int k=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(k+64)+" ");
            }
            k-=1;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern16(int n){
        System.out.println("Pattern 16");
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern17(int n){
        System.out.println("Pattern 17");
        System.out.println();
        for(int i=1; i<=n; i++){
            int k=n;
            for(int j=1; j<=i; j++){
                System.out.print((char)(k+64)+" ");
                k-=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern18(int n){

        System.out.println("Pattern 18");
        System.out.println();

        int k=1;
        int l=1;
        for(int i=1 ; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print((char)(k+64)+" ");
                k-=1;                
            }
            l+=i+1;
            k=l;
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }

    public static void printPattern19(int n){

        System.out.println("Pattern 19");
        System.out.println();

        int k=n*3;
        int l=n*3;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char)(k+64)+" ");
                k-=1;
            }
            l-=i;
            k=l;
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern20(int n){

        System.out.println("Pattern 20");
        System.out.println();

        int k=1;
        int l=1;
        for(int i=1 ; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print((char)(k+64)+" ");
                k-=1;                
            }
            l+=i;
            k=l;
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }

    public static void printPattern21(int n){

        System.out.println("Pattern 21");
        System.out.println();

        int k=2;
        int l=4;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.printf("%-5d",k);
                k+=l;
                l+=2;

            }

            System.out.println();

        }
        System.out.println();
        System.out.println();

    }

    
}
