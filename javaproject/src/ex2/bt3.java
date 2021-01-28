package ex2;
import java.util.Scanner;
public class bt3 {
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
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("n! = " + factorial);
    }
}
