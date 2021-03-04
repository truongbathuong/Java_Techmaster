package buoi5;

public class Student extends Person{
    public float cpa;
    public Student(String name, int age, String address, float cpa) {
        super(name,age,address);
        this.cpa = cpa;
    }
    
    
}
