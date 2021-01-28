package ex2;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        c = scanner.nextDouble();
        scanner.close();
        if (a + b <= c) {
            System.out.println("3 so nay khong phai canh cua 1 tam giac");
        } else {
            if (a + c <= b) {
                System.out.println("3 so nay khong phai canh cua 1 tam giac");
            } else {
                if (b + c <= a) {
                    System.out.println("3 so nay khong phai canh cua 1 tam giac");
                } else {
                    System.out.println("3 so nay la canh cua 1 tam giac");
                }
            }
        }
    }
}
