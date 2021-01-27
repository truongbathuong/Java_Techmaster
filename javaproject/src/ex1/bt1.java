package ex1;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) throws Exception {
        Scanner ex1 = new Scanner(System.in);
        double r, per,area;
        System.out.println("Nhập bán kính: ");
        r = ex1.nextDouble();
        per = Math.PI * 2 * r;
        System.out.println("Chu vi hình tròn: " + per);
        area = Math.PI * r *r;
        System.out.println("Diện tích hình tròn: " + area);
        ex1.close();
    }
}
