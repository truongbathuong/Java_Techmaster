package ex7;

import java.util.Scanner;

public class Student extends Person {
    public String id;
    public double gPA;
    public String email;
    Scanner scanner = new Scanner(System.in);
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getgPA() {
        return gPA;
    }

    public void setgPA(double gPA) {
        this.gPA = gPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap ma sinh vien:");
        setId(scanner.nextLine());
        System.out.println("Nhap email:");
        setEmail(scanner.nextLine());
        System.out.println("Nhap diem trung binh:");
        setgPA(scanner.nextDouble());
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Ma sinh vien: " + getId());
        System.out.println("Email: " + getEmail());
        System.out.println("Diem trung binh: " + getgPA());
    }
}
