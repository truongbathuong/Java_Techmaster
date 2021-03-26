package test1;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang ( 8 < N < 14) ");
        int n = scanner.nextInt();
        while( n <8 || n >14){
            System.out.println("Nhap sai. Hay nhap lai N :");
            n = scanner.nextInt();
        }
        Random rd = new Random();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = -10 + rd.nextInt(21);
        }

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Nhap X ( -10 < X < 10) ");
        int x = scanner.nextInt();
        while( x <-10 || x >10){
            System.out.println("Nhap sai. Hay nhap lai X :");
            x = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Cac cap so co tong bang X : ");
        for(int i = 0;i < n-1;i++){
            for(int j=i+1; j<n;j++){
                if (arr[i] + arr[j] == x){
                    System.out.println( arr[i] + " " +  arr[j]);
                }
            }
        }

    }
}
