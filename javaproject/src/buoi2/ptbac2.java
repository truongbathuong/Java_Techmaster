package buoi2;

import java.util.Scanner;

public class ptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x, x1, x2;
        System.out.println("Nhap a: ");
        a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Vui long nhap lai a");
            a = scanner.nextDouble();
        }
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        c = scanner.nextDouble();
        scanner.close();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep, x = " + x);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem, x1 = " + x1 + " x2 = " + x2);
        }

    }
}
