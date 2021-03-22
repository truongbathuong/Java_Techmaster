package ex13;

public class Kitchen extends Employee{
    private long serviceCharge;
    
    @Override
    public long calculatorSalary(){
        return getServiceCharge() + getBasicSalary();
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }
}
