package buoi5;

public class Car {
    public String brand;
    public String color;
    public int price;
    public Car(String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public void speed(int speed){
        System.out.println("Toc do " + brand +" "+ speed + " km/h");
    }
}
