package buoi6;

public class Cat extends Animal{
    public boolean isNasty;
    public Cat(String name, String gender, float age, float weight, String color,boolean isNasty) {
        super(name, gender, age, weight, color);
        this.isNasty = true;
        
    }
    
    
}
