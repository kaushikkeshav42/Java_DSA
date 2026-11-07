import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number to Create a Pattern.");
        int n= scanner.nextInt();

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
        scanner.close();

    }

    public static void printPattern1(int n){

        System.out.println("Pattern 1");
        System.out.println();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i==1||i==n||j==1||j==n){

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

    public static void printPattern2(int n){

        System.out.println("Pattern 2");
        System.out.println();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i>=n-1||i<=2||j<=2||j>=n-1){
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

        System.out.println("Pattern 3");
        System.out.println();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i==j||i+j==n+1){
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

    public static void printPattern4(int n){

        System.out.println("Pattern 4");
        System.out.println();

        if(n%2==0){

            System.out.println("Value Entered is Even Pattern not possible.");
            return;
        }

        int mid = (n/2)+1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i==mid||j==mid){
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

    public static void printPattern5(int n){

        System.out.println("Pattern 5");
        System.out.println();

        if(n%2==0){

            System.out.println("Value Entered is Even Pattern not possible.");
            return;
        }

        int mid = (n/2)+1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i==mid||i==1||i==n||j==1||j==n||j==mid||i==j||(i+j)==(n+1)){
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

    public static void printPattern6(int n){

        System.out.println("Pattern 6");
        System.out.println();

        if(n%2==0){

            System.out.println("Value Entered is Even Pattern not possible.");
            return;
        }

        int mid = (n/2)+1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i==mid||j==mid||(j==1 && i<=mid)||(j==n && i>mid)||(i==1 && j>=mid)||(i==n && j<=mid)){
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

    public static void printPattern7(int n){
    int mid = (n/2)+1;
    int start = 1;
    int end = n;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 7");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=start|| j>=end){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                start+=1;
                end-=1;
            }
            else{
                start-=1;
                end+=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
    }


   public static void printPattern8(int n){
    int mid = (n/2)+1;
    int start = mid;
    int end = mid;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 8");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==start|| j==end){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                start-=1;
                end+=1;
            }
            else{
                start+=1;
                end-=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
   }

   public static void printPattern9(int n){
    int mid = (n/2)+1;
    int start = 1;
    int end = n;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 9");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=start|| j>=end|| i==mid|| j==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                start+=1;
                end-=1;
            }
            else{
                start-=1;
                end+=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
    }

    public static void printPattern10(int n){
    int mid = (n/2)+1;
    int start = mid;
    int end = mid;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 10");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==start|| j==end||j==mid||i==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                start-=1;
                end+=1;
            }
            else{
                start+=1;
                end-=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
   }

   public static void printPattern11(int n){
    int mid = (n/2)+1;
    int start = mid;
    int end = mid;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 11");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=start|| j>=end){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                start-=1;
                end+=1;
            }
            else{
                start+=1;
                end-=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
   }

   public static void printPattern12(int n){
    int mid = (n/2)+1;
    int start = mid;
    int end = mid;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 12");
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=start|| j>=end|| j==mid|| i==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                start-=1;
                end+=1;
            }
            else{
                start+=1;
                end-=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
   }

   public static void printPattern13(int n){
    int mid = (n/2)+1;
    int start = 1;
    int end = n;
    if(n%2==0){
        System.out.println("Failed to Generate Pattern !!!.\nPlease Enter any Odd Number.");
    }
    else{
        System.out.println("Pattern 13");
        System.out.println();

        for(int i=1; i<=2*n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start|| j<=end){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<n){
                start+=1;
                end-=1;
            }
            else{
                start-=1;
                end+=1;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
    }
}
