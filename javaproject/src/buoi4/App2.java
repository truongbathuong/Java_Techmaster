package buoi4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Nhap mot chuoi bat ki: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        StringTokenizer stringTokenziner = new StringTokenizer(str," ");
        System.out.println("So phan tu trong chuoi: "+ stringTokenziner.countTokens());

    }
}
