package ex1;
import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) throws Exception {
        Scanner ex2 = new Scanner(System.in);
        int a;
        System.out.println("Nhập số : ");
        a = ex2.nextInt();
        String s = (a % 2 == 0) ? "Số chẵn" : "Số lẻ";
        System.out.println(s);
        ex2.close();
    }
}

