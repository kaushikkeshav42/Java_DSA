import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows to Generate a Pattern.");
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
        printPattern32(n);
        printPattern33(n);
        sc.close();
    }

    public static void printPattern1(int n){
        System.out.println("Pattern 1");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        char k ='*';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3c",k);
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern2(int n){
        System.out.println("Pattern 2");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",i);
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern3(int n){
        System.out.println("Pattern 3");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",i%2);
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern4(int n){
        System.out.println("Pattern 4");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            int k =1;
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                    k+=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern5(int n){
        System.out.println("Pattern 5");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            int k =1;
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k%2);
                    k+=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern6(int n){
        System.out.println("Pattern 6");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k= 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                    k+=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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
    
    public static void printPattern7(int n){
        System.out.println("Pattern 7");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k= n*3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                    k-=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern8(int n){
        System.out.println("Pattern 8");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k= n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                }
                else{
                    System.out.print("   ");
                }
            }
            k-=1;
            if(i<(n/2)+1){
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

    public static void printPattern9(int n){
        System.out.println("Pattern 9");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            int k = (end-start)+1;
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                    k-=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern10(int n){
        System.out.println("Pattern 10");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
                start-=1;
                end+=1;
                k+=1;
            }
            else{
                start+=1;
                end-=1;
                k-=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern11(int n){
        System.out.println("Pattern 11");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k = (n-end);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
                start-=1;
                end+=1;
                k-=1;
            }
            else{
                start+=1;
                end-=1;
                k+=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern12(int n){
        System.out.println("Pattern 12");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k = (n-end)+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
                start-=1;
                end+=1;
                k-=1;
            }
            else{
                start+=1;
                end-=1;
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

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            int k = 1;
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%-3d",k);
                    if(j<n/2+1){
                        k+=1;
                    }
                    else{
                        k-=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern14(int n){
        System.out.println("Pattern 14");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j<n/2+1){
                        System.out.printf("%-3d",(n/2+1)-j);
                    }
                    else{
                        System.out.printf("%-3d",j-(n/2+1));
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern15(int n){
        System.out.println("Pattern 15");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j<n/2+1){
                        System.out.printf("%-3d",(n/2+1)-j+1);
                    }
                    else{
                        System.out.printf("%-3d",1+j-(n/2+1));
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern16(int n){
        System.out.println("Pattern 16");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1)){
                        System.out.printf("%3d",1);
                    }
                    else{
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern17(int n){
        System.out.println("Pattern 17");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1)){
                        System.out.printf("%3d",0);
                    }
                    else{
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern18(int n){
        System.out.println("Pattern 18");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3d",0);
                    }
                    else{
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern19(int n){
        System.out.println("Pattern 19");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3d",1);
                    }
                    else{
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern20(int n){
        System.out.println("Pattern 20");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3d",0);
                    }
                    else{
                        System.out.printf("%3d",1);
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern21(int n){
        System.out.println("Pattern 21");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3d",1);
                    }
                    else{
                        System.out.printf("%3d",0);
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern22(int n){
        System.out.println("Pattern 22");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3c",'@');
                    }
                    else{
                        System.out.printf("%3c",'*');
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern23(int n){
        System.out.println("Pattern 23");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3c",'*');
                    }
                    else{
                        System.out.printf("%3c",'@');
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern24(int n){
        System.out.println("Pattern 24");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3c",'@');
                    }
                    else{
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern25(int n){
        System.out.println("Pattern 25");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    if(j==(n/2+1) || i==(n/2+1)){
                        System.out.printf("%3c",'*');
                    }
                    else{
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern26(int n){
        System.out.println("Pattern 26");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(i+64));
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern27(int n){
        System.out.println("Pattern 27");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            int k=1;
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                    k+=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern28(int n){
        System.out.println("Pattern 28");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                    k+=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern29(int n){
        System.out.println("Pattern 29");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k = n*4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                    k-=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern30(int n){
        System.out.println("Pattern 30");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
                start-=1;
                end+=1;
                k+=1;
            }
            else{
                start+=1;
                end-=1;
                k-=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern31(int n){
        System.out.println("Pattern 31");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
                start-=1;
                end+=1;
                k-=1;
            }
            else{
                start+=1;
                end-=1;
                k+=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printPattern32(int n){
        System.out.println("Pattern 32");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        for(int i=1; i<=n; i++){
            int k=1;
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                    k+=1;
                }
                else{
                    System.out.print("   ");
                }
            }
            if(i<(n/2)+1){
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

    public static void printPattern33(int n){
        System.out.println("Pattern 33");
        System.out.println();

        int start = n/2+1;
        int end = n/2+1;
        int k;
        for(int i=1; i<=n; i++){
            if(i<=(n/2+1)){
                k=i;
            }
            else{
                k = n-i+1;
            }
            for(int j=1; j<=n; j++){
                if(j>=start && j<=end){
                    System.out.printf("%3c",(char)(k+64));
                    if(j<(n/2+1)){
                        k-=1;
                    }
                    else{
                        k+=1;
                    }
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
