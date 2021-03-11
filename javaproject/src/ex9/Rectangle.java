package ex9;

public class Rectangle extends Geometry implements Diagonal  {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter(){
        return (length+ width)*2;
    }

    @Override 
    public double getArea(){
        return length * width;
    }

    @Override
    public double getDiagonal(){
        return Math.sqrt(length*length + width*width);
    }

    public void output(){
        System.out.println("Chu vi hinh chu nhat " + this.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + this.getArea());
        System.out.println("Duong cheo : " + this.getDiagonal());
    }
}
