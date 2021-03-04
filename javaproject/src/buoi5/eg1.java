package buoi5;

import java.util.Scanner;

// import java.text.SimpleDateFormat;
// import java.util.Date;
public class eg1 {
    public static void main(String[] args) {
        // Date date = new Date();
        // SimpleDateFormat fDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        // String currentDate = fDateFormat.format(date);
        // System.out.println(currentDate);
        Person person = new Person();
        // person.setName("Hanh");
        // person.setAge(25);
        // person.setAddress("ND");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age= Integer.valueOf(scanner.nextLine());
        System.out.println("nhap dia chi");
        String address = scanner.nextLine();
        scanner.close();
        person.setName(name);
        person.setAddress(address);
        person.setAge(age);

        // person.getName();
        // person.getAge();
        // person.getAddress();
        // person.name = "Hanh";
        // person.age = 25;
        // person.address = "ND";
        // System.out.println("Ten toi la " + person.name);
        person.move();
        person.study("Math");
        person.hobby("football");
    }
}
