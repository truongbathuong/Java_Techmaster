package buoi3;

import java.util.Scanner;

public class jv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap so hang");
        n = sc.nextInt();
        System.out.println("Nhap so cot");
        m = sc.nextInt();
        int[][] arr;
        arr = new int[n][m];
        System.out.println("Nhap phan tu mang");
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0;i<n;i++){
            System.out.println(" ");
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j] + "\t");
            }
        }
        int sum =0;
        for(int i = 0;i<n;i++){
            sum+=arr[i][i];
        }
        System.out.println("");
        System.out.println("Tong duong cheo chinh: " + sum);
        int max = arr[0][0], min = arr[0][0];
        for (int i =1;i<n;i++){
            if(arr[i][i]>max){max= arr[i][i];}
        }
        System.out.println("Gia tri lon nhat tren duong cheo chinh: " + max);
        for (int i =1;i<n;i++){
            if(arr[i][i]<min){min= arr[i][i];}
        }
        System.out.println("Gia tri lon nhat tren duong cheo chinh: " + min);
    }
}
