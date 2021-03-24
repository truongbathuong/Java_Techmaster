package ex14;

public class Teacher extends Person{
    private long salary;

    public Teacher(String name, String id, int age, String address, long salary) {
        super(name, id, age, address);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public String toString(){
        return getId() + " - " + getName() + " - "+ getAge() + " - " +getAddress() +" - " + getSalary();
    }
    
}
