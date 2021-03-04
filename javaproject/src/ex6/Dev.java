package ex6;

import java.util.Scanner;

public class Dev extends Employee {
    Scanner scanner = new Scanner(System.in);
    private int overtime;
    public void setOvertime(int overtime){
        this.overtime = overtime;
    }
    public int getOvertime(int overtime){
        return overtime;
    }
    public int salaryDev(){
        return (getBasicSalary()+ overtime *2000000);
    }
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap so gio lam them: ");
        overtime = scanner.nextInt();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("So gio lam them : " + overtime);
    }
   
}

