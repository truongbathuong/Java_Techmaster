package buoi4;

import java.util.Scanner;

public class App32 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n;
        n = scanner.nextInt();
        int[] arr;
        int size =20;
        arr = new int[size];
        for (int i =0; i< n; i++){
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        // System.out.println("Nhap phan tu muon them vao: ");
        // int x = scanner.nextInt();
        // n= insert(arr, n, size, x);
        // System.out.println("Mang sau khi them lai: ");
        // xuatMang(n, arr);
        // System.out.println("Nhap vi tri can chen: ");
        // int k = scanner.nextInt();
        // System.out.println("Nhap so can chen");
        // int z = scanner.nextInt();
        // n = insertPop(arr, n, size, z, k);
        // System.out.println("Mang sau khi chen");
        // xuatMang(n,arr);
        System.out.println("Nhap vi tri can xoa: ");
        int y = scanner.nextInt();
        System.out.println("Mang sau khi xoa: ");
        n = delete(arr, n, size, y);
        xuatMang(n, arr);
        scanner.close();

    }
    public static  void xuatMang(int n, int arr[]){
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static int insert(int arr[], int n, int size, int x){
        if (n>= size){
            return n;
        }
        arr[n] = x;
        return n+1;
    }
    public static int insertPop(int arr[], int n, int size, int z, int k){
        if (k <0 || k>=n){
            return n;
        } else{
            for (int i=n;i>k;i--){
                arr[i]=arr[i-1];
            }
            arr[k] = z;
            return n+1;
            }
        }
        public static int delete(int arr[], int n, int size, int y){
            if (n>= size){
                return n;
            }
            if (y <0 || y>=n){
                return n;
            } else{
                for (int i = y;i<n;i++){
                    arr[i] = arr[i+1];
                }
                return n-1;
        }
    }
}
    

