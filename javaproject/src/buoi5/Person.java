package buoi5;

public class Person {
    private String name;
    private int age;
    private String address;

    // public Person(){
    //     System.out.println("Goi toi constructor");
    // }
    public Person(){}
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void move(){
        System.out.println("Phuong thuc move");
        System.out.println(name + "study English");
    }
    public void study(String subject){
        System.out.println(name + " study " + subject);
    }
    public void hobby(String hobby){
            System.out.println(name + " likes " + hobby);
        }
    // public String getName(){
    //     return this.name;
    // }
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
