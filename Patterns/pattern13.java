import java.util.Scanner;

public class pattern13 {
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
        printPattern14(n);
        printPattern15(n);
        sc.close();
    }

    public static void printPattern1(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 1");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3c", '*');
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

    public static void printPattern2(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 2");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3d", i);
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

    public static void printPattern3(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 3");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3d", i%2);
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

    public static void printPattern4(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 4");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3d", j);
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

    public static void printPattern5(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 5");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3d", j%2);
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

    public static void printPattern6(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 1");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                int k =1;
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3d",k);
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

    public static void printPattern7(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 7");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        if(j<=n/2+1){
                            System.out.printf("%3d",j);
                        }
                        else{
                            System.out.printf("%3d",(n+1)-j);
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
    
    public static void printPattern8(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 8");
            System.out.println();

            int start = 1;
            int end = n;
            int  k =1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%-4d",k);
                        k+=1;
                    } else {
                        System.out.print("    ");
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

    public static void printPattern9(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 9");
            System.out.println();

            int start = 1;
            int end = n;
            int  k =(n*5)-(n/2+1);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%-4d",k);
                        k-=1;
                    } else {
                        System.out.print("    ");
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

    public static void printPattern10(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 10");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3c",(char)(i+64));
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
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3c",(char)(j+64));
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

    public static void printPattern12(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 12");
            System.out.println();

            int start = 1;
            int end = n;
            int k =1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3c",(char)(k+64));
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

    public static void printPattern13(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 13");
            System.out.println();

            int start = 1;
            int end = n;
            int k =n*3;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3c",(char)(k+64));
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

    public static void printPattern14(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 14");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                int k =1;
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        System.out.printf("%3c",(char)(k+64));
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

    public static void printPattern15(int n) {
        if (n % 2 == 0) {
            System.out.println("Failed to Generate a Pattern !!! \nEnter Odd Number of Rows to Generate a Pattern.");
        } else {
            System.out.println("Pattern 15");
            System.out.println();

            int start = 1;
            int end = n;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j <= start || j >= end) {
                        if(j<=n/2+1){
                            System.out.printf("%3c",(char)(j+64));
                        }
                        else{
                            System.out.printf("%3c",(char)((n+1)-j+64));
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



}
