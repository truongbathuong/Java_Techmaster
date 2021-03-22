package ex13;

public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private long basicSalary;
    
    public abstract long calculatorSalary();
    public String toString(){
        return id + " "+ name +" "+ age +" "+calculatorSalary();
    }
    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getBasicSalary() {
        return basicSalary;
    }
    public Employee(String id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }
    
}
