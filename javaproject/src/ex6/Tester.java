package ex6;

public class Tester extends Employee{
    private int bug;
    public void setBug(int bug){
        this.bug = bug;
    }
    public int getBug(){
        return bug;
    }
    public int salaryTester(){
        return (getBasicSalary()+bug*50000);
    }
    public void input(){
        super.input();
        System.out.println("Nhap so loi phat hien: ");
        bug = scanner.nextInt();
    }
    public void display(){
        super.display();
        System.out.println("So loi phat hien: " + bug);
    }
}
