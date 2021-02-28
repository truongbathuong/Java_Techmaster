package ex6;

public class Dev extends Employee {
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
    
}

