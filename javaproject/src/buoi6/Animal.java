package buoi6;

public class Animal {
    public String name;
    public String gender;
    public float age;
    public float weight;
    public String color;

    public Animal(String name, String gender, float age, float weight, String color) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
    public void display(){
        System.out.printf("%5s %5s %.2f %.2f %5s \n",name,gender,age,weight,color);
    }
    public void eat(String food){
        System.out.println(name + " eats " + food);
    }
    public void run(float speed){
        System.out.println(name +" speed: " + speed);
    }
    public void sleep(int hours){
        System.out.println(name + " sleeps " + hours + "hours");
    }
}