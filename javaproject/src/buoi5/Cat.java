package buoi5;

public class Cat {
    public String species;
    public String color;
    public String gender;
    public Cat(String species, String color, String gender){
        this.species = species;
        this.color = color;
        this.gender = gender;
    }
    public void voice(String voice){
    System.out.println(this.species +" Meooooooooooooooooooo! " + voice);
    }
}
