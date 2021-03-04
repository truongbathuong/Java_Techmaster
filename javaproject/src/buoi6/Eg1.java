package buoi6;

public class Eg1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Belgan","Male", 8f,1.2f,"Gray white");
        animal1.display();
        animal1.eat("fish");
        animal1.sleep(10);
    }
}
