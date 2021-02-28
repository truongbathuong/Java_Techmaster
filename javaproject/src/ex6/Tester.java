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
}
