package ex13;

public class Waiter extends Employee{
    private long compensate;
    
    @Override
    public long calculatorSalary(){
        return getCompensate() + getBasicSalary();
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    public Waiter(String id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }
    
}   
    
