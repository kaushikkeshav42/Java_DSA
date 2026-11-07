import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        printPattern1(n);
        sc.close();
    }

    public static void printPattern1(int n){

        System.out.println("Pattern 10");
        System.out.println();

        int k=1;
        int l=1;
        for(int i=1 ; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.printf("%-4d", k);
                if(i%2==0 || i==1){
                    k-=1;
                }
                else{
                    k+=1;
                }               
            }
            if(i%2==0){
                l+=1;
            }
            else{
                l+=i+1;
            }
            k=l;
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }
}