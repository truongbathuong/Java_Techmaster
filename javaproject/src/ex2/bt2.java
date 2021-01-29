package ex2;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen duong n");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Nhap lai n > 0");
            n = scanner.nextInt();
        }
        scanner.close();
        if (n == 1) {
            System.out.println("Day fibonaci:\n1");
        }
        if (n>1){
            System.out.println("Day fibonaci:\n1\n1");
            int a=1,b=0,c=0;

            for (int i =2;i<n; i++){
                c=a;
                a+=b;
                b=c;
                
                System.out.println(a);
            }
        }
    }
}
