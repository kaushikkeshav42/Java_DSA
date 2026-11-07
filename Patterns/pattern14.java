import java.util.Scanner;

public class pattern14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number to Generate a Pattern.");
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
        sc.close();
    }

    public static void printPattern1(int n){
        System.out.println("Pattern 1");
        System.out.println();

        int k =2;
        int l= 4;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            k+=l;
            l+=2;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern2(int n){
        System.out.println("Pattern 2");
        System.out.println();

        int k =2;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            k = (k*2)+1;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern3(int n){
        System.out.println("Pattern 3");
        System.out.println();

        int k =3;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            k = (k*2)-1;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern4(int n){
        System.out.println("Pattern 4");
        System.out.println();

        int k =1;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            k = (k*k)+1;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern5(int n){
        System.out.println("Pattern 5");
        System.out.println();

        int k =1;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            if(i%2==0){
                k = k*3;
            }
            else{
                k+=1;
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern6(int n){
        System.out.println("Pattern 6");
        System.out.println();

        int k =1;
        int l=2;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            k +=l ;
            l+=2;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern7(int n){
        System.out.println("Pattern 7");
        System.out.println();

        int l=0;
        int k =1;
        int m;
        System.out.print(l+" "+k+" ");
        for(int i=1; i<=n; i++){
            m=l+k;
            System.out.print(m+" ");
            l=k;
            k=m;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern8(int n){
        System.out.println("Pattern 8");
        System.out.println();

        int l=0;
        int a=0;
        int k =1;
        int m;
        System.out.print(l+" "+a+" "+k+" ");
        for(int i=1; i<=n; i++){
            m=l+a+k;
            System.out.print(m+" ");
            l=a;
            a=k;
            k=m;
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern9(int n){
        System.out.println("Pattern 9");
        System.out.println();

        int k =1;
        for(int i=1; i<=n; i++){
            System.out.print(k+" ");
            k = k*2+1;
        }
        System.out.println();
        System.out.println();
    }


}