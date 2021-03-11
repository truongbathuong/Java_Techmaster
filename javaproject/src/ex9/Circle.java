package ex9;

public class Circle extends Geometry implements Diameter{
    private double r;
    
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter(){
        return r*2*3.14;
    }

    @Override
    public double getArea(){
        return r*r*3.14;
    }
    
    @Override
    public double getDiameter(){
        return r*2;
    }

    public void output(){
        System.out.println("Chu vi hinh tron: " + this.getPerimeter());
        System.out.println("Dien tich hinh tron: " + this.getArea());
        System.out.println("Duong kinh hinh tron: " + this.getDiameter() +"\n");
    }
}
