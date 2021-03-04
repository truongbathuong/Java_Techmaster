package ex6;

import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private long phoneNum;
    private String email;
    private int basicSalary;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void input() {
        System.out.println("Nhap ma nhan vien: ");
        id = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap ten nhan vien: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.println("Nhap so dien thoai: ");
        phoneNum = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhap email: ");
        email = scanner.nextLine();
        System.out.println("Nhap luong co ban");
        basicSalary = scanner.nextInt();
    }
    public void display(){
        System.out.println("Ma nhan vien: "+ id);
        System.out.println("Ten nhan vien: "+ name);
        System.out.println("Tuoi:" + age);
        System.out.println("So dien thoai: "+phoneNum);
        System.out.println("Email: "+ email);
        System.out.println("Luong co ban: "+ basicSalary);
    }


    
    
}
