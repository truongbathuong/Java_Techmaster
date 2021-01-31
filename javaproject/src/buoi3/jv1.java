package buoi3;

import java.util.Scanner;

public class jv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n");
        n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.println("Nhap phan tu thu " + (i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Mang vua nhap:");
        for (int j =0; j <n;j++){
            System.out.println(arr[j]);
        }
        int min = arr[0],max =arr[0];
        for (int i =1; i < n;i++){
            if (arr[i] < min) { min = arr[i];}
        }
        System.out.println("Phan tu co gia tri nho nhat la: " + min);
        for (int i =1; i < n;i++){
            if (arr[i] > max) { max = arr[i];}
        }
    
        System.out.println("Phan tu co gia tri lon nhat la: " + max);
        System.out.println("Mang dao nguoc");
        for (int i =n-1; i >=0;i--){
           System.out.println(arr[i]);
        }
        int c;
        for (int i =0; i < n-1; i++){
            for (int j=i+1; j < n;j++){
                if (arr[j] < arr[i]){
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
    
        }
        System.out.println("mang tang dan:");
        for (int i =0; i <n;i++){
            System.out.println(arr[i]);
        }
    }
}
