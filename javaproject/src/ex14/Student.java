package ex14;

public class Student extends Person {
    private double gpa;

    public Student(String name, String id, int age, String address, double gpa) {
        super(name, id, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString(){
       return getId() + " - " + getName() + " - "+ getAge() + " - " +getAddress() +" - " + getGpa();
    }
    
}
