public class Triangle extends GeometricObject{
    private double side1, side2, side3;
    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;
    }
    //what's the difference between these two constructors?

    public double getArea(){
        double area = (side1 + side2 + side3)/2;
        return area;
    }

    public double getPerimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public String toString(){
        return super.toString() + " Side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3 + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }

}
