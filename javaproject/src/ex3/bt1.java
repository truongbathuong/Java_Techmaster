package ex3;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Mang vua nhap vao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri max cua mang: " + max);
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri min cua mang: " + min);
        int even = 0;
        System.out.print("Cac so chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "\t");
                even++;
            }
        }
        System.out.println("");
        System.out.println("Trong mang co " + even + " so chan");
        System.out.print("Cac so nguyen to trong mang:" + "\t");
        for (int i = 0; i < n; i++) {
            int z = 0;
            if (arr[i] < 2) {
                z = 1;
            }
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    z = 1;
                    break;
                }
            }
            if (z == 0) {
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println("");
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mang theo chieu tang dan");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mang theo chieu giam dan");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
