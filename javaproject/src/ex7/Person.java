package ex7;

import java.util.Scanner;

public class Person{
    public String name;
    public String gender;
    public String address;
    public String dob;
    Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void input(){
        System.out.println("Nhap ten: ");
        setName(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        setGender(scanner.nextLine());
        System.out.println("Nhap dia chi:");
        setAddress(scanner.nextLine());
        System.out.println("Nhap ngay sinh:");
        setDob(scanner.nextLine());
    }
    public void display(){
        System.out.println("Ten: "+ getName());
        System.out.println("Gioi tinh: " + getGender());
        System.out.println("Dia chi: " + getAddress());
        System.out.println("Ngay sinh: " + getDob());
    }


   

    

}