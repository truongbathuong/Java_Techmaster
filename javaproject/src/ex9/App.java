package ex9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh duong tron:");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        circle.output();
        System.out.println("Nhap chieu dai hinh chu nhat:");
        double length = scanner.nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat:");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.output();
        scanner.close();
    }
}
