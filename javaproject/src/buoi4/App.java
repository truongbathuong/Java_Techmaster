package buoi4;

import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int n, soDu, tong = 0;
        System.out.println("Nhap n:");
        n = scanner.nextInt();
        scanner.close();
        while(n>0){
            soDu = n % 10;
            n = n/10;
            tong += soDu;
        }
        System.out.println("Tong cac chu so cua so nguyen vua nhap: " + tong);
    }
    }