import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner bt = new Scanner(System.in);
        double r, chuvi;
        System.out.println("Nhập bán kính: ");
        r = bt.nextDouble();
        chuvi = Math.PI * 2 * r;
        System.out.println("Chu vi hình tròn: " + chuvi);
        int a;
        System.out.println("Nhập số: ");
        a = bt.nextInt();
        if (a % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
        System.out.println("Số tiền phải trả hàng tháng: " + (100000000 / 12 + 100000000 * 1 / 100));
        bt.close();
    }
}
