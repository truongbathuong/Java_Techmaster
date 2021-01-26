import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Scanner sc = new Scanner(System.in);
        // String name,address;
        // int age;
        // System.out.println("Nhap ten: ");
        // name = sc.nextLine();
        // System.out.println("Nhap tuoi: ");
        // age = Integer.valueOf(sc.nextLine());
        // System.out.println("Nhap que quan: ");
        // address = sc.nextLine();
        // System.out.println("Ten ban la "+ name + ", tuoi "  + age +", que quan "+ address);
        // sc.close();
        Scanner bt2 = new Scanner(System.in);
        double height;
        double weight;
        System.out.println("Nhap chieu cao (m)");
        height = bt2.nextDouble();
        System.out.println("Nhap can nang(kg)");
        weight = bt2.nextDouble();
        double IBM =weight/Math.pow(height,2);
        System.out.println("Chỉ số IBM: "+ IBM);
        bt2.close();
    }
}
enum Season{
    SPRING, WINTER, AUTAUMN, SUMMER;
}