package ex9;

public class Rectangle extends Geometry implements Diagonal  {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter(){
        return (getLength()+ getWidth())*2;
    }

    @Override 
    public double getArea(){
        return getLength() * getWidth();
    }

    @Override
    public double getDiagonal(){
        return Math.sqrt(getLength()*getLength() + getWidth()*getWidth());
    }

    public void output(){
        System.out.println("Chu vi hinh chu nhat " + this.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + this.getArea());
        System.out.println("Duong cheo : " + this.getDiagonal());
    }

}
