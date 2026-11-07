import java.util.Scanner;

public class pattern15 {
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
        sc.close();
    }

    public static void printPattern1(int n){
        if(n%2==0){
            System.out.println("Failed to Generate Pattern !!!! \nEnter Odd Number of Rows to Generate Pattern.");
        }
        else{
            System.out.println("Pattern 1");
            System.out.println();
            
            int start = n/2+1;
            int end = n/2+1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==start || j==end){
                        System.out.printf("%3c",'*');
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern2(int n){
        if(n%2==0){
            System.out.println("Failed to Generate Pattern !!!! \nEnter Odd Number of Rows to Generate Pattern.");
        }
        else{
            System.out.println("Pattern 2");
            System.out.println();
            
            int start = n/2+1;
            int end = n/2+1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==start || j==end){
                        System.out.printf("%3d",i);
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern3(int n){
        if(n%2==0){
            System.out.println("Failed to Generate Pattern !!!! \nEnter Odd Number of Rows to Generate Pattern.");
        }
        else{
            System.out.println("Pattern 3");
            System.out.println();
            
            int start = n/2+1;
            int end = n/2+1;
            int k=1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==start || j==end){
                        System.out.printf("%3d",k);
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
                    k+=1;
                    start-=1;
                    end+=1;
                }
                else{
                    k-=1;
                    start+=1;
                    end-=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern4(int n){
        if(n%2==0){
            System.out.println("Failed to Generate Pattern !!!! \nEnter Odd Number of Rows to Generate Pattern.");
        }
        else{
            System.out.println("Pattern 4");
            System.out.println();
            
            int start = n/2+1;
            int end = n/2+1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==start || j==end){
                        System.out.printf("%3c",(char)(i+64));
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern5(int n){
        if(n%2==0){
            System.out.println("Failed to Generate Pattern !!!! \nEnter Odd Number of Rows to Generate Pattern.");
        }
        else{
            System.out.println("Pattern 5");
            System.out.println();
            
            int start = n/2+1;
            int end = n/2+1;
            int k=1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==start || j==end){
                        System.out.printf("%3c",(char)(k+64));
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
                    k+=1;
                    start-=1;
                    end+=1;
                }
                else{
                    k-=1;
                    start+=1;
                    end-=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
