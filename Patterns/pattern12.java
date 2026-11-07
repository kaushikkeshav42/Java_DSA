import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Odd Number of Rows to Generate a pattern");
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
        sc.close();
    }

    public static void printPattern1(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 1");
            System.out.println();

            int start = 1;
            int end = n;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3c",'*');
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern2(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 2");
            System.out.println();

            int start = 1;
            int end = n;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",i);
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern3(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 3");
            System.out.println();

            int start = 1;
            int end = n;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",i%2);
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern4(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 4");
            System.out.println();

            int start = 1;
            int end = n;
            for(int i=1; i<=n; i++){
                int k=1;
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern5(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 5");
            System.out.println();

            int start = 1;
            int end = n;
            for(int i=1; i<=n; i++){
                int k=1;
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",k%2);
                        k+=1;
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern6(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 6");
            System.out.println();

            int start = 1;
            int end = n;
            int k=1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",k);
                        k+=1;
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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

    public static void printPattern7(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 7");
            System.out.println();

            int start = 1;
            int end = n;
            int k=n*5;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",k);
                        k-=1;
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                if(i<(n/2+1)){
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
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 8");
            System.out.println();

            int start = 1;
            int end = n;
            for(int i=1; i<=n; i++){
                int k=1;
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",k);
                        if(j<(n/2+1)){
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
                if(i<(n/2+1)){
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

    public static void printPattern9(int n){
        if(n%2==0){
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        }
        else{
            System.out.println("Pattern 9");
            System.out.println();

            int start = 1;
            int end = n;
            int k;
            for(int i=1; i<=n; i++){
                if(i<=(n/2+1)){
                    k = (n/2+1)-i;
                }
                else{
                    k = i-(n/2+1);
                }
                for(int j=1; j<=n; j++){
                    if(j>=start && j<=end){
                        System.out.printf("%3d",k);
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

    public static void printPattern10(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 10");
            System.out.println();

            int start = 1;
            int end = n;
            int k;
            for (int i = 1; i <= n; i++) {
                if (i <= (n / 2 + 1)) {
                    k = (n / 2 + 1) - i+1;
                } else {
                    k = i+1 - (n / 2 + 1);
                }
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3d", k);
                        if (j < (n / 2 + 1)) {
                            k -= 1;
                        } else {
                            k += 1;
                        }
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                } else {
                    start -= 1;
                    end += 1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern11(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 11");
            System.out.println();

            int start = 1;
            int end = n;
            int k =1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3d", k);
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                    k+=1;
                } else {
                    start -= 1;
                    end += 1;
                    k-=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern12(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 12");
            System.out.println();

            int start = 1;
            int end = n;
            int k =n/2;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3d", k);
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                    k-=1;
                } else {
                    start -= 1;
                    end += 1;
                    k+=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern13(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 13");
            System.out.println();

            int start = 1;
            int end = n;
            int k =n/2+1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3d", k);
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                    k-=1;
                } else {
                    start -= 1;
                    end += 1;
                    k+=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern14(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 14");
            System.out.println();

            int start = 1;
            int end = n;
            int k =n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3d", k);
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                } else {
                    start -= 1;
                    end += 1;
                }
                k-=1;
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern15(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 15");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                int k = (end - start)+1;
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3d", k);
                        k-=1;
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                } else {
                    start -= 1;
                    end += 1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern16(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 16");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3c", (char)(i+64));
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                } else {
                    start -= 1;
                    end += 1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern17(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 17");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                int k =1;
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3c", (char)(k+64));
                        k+=1;
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                } else {
                    start -= 1;
                    end += 1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern18(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 18");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                int k =1;
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3c", (char)(k+64));
                        if(j<(n/2+1)){
                            k+=1;
                        }
                        else{
                            k-=1;
                        }
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                } else {
                    start -= 1;
                    end += 1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void printPattern19(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 19");
            System.out.println();

            int start = 1;
            int end = n;
            int l = n/2+1;
            for (int i = 1; i <= n; i++) {
                int k = l;
                for (int j = 1; j <= n; j++) {
                    if (j >= start && j <= end) {
                        System.out.printf("%3c", (char)(k+64));
                        if(j<(n/2+1)){
                            k-=1;
                        }
                        else{
                            k+=1;
                        }
                    } else {
                        System.out.print("   ");
                    }
                }
                if (i < (n / 2 + 1)) {
                    start += 1;
                    end -= 1;
                    l-=1;
                } else {
                    start -= 1;
                    end += 1;
                    l+=1;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    

}
