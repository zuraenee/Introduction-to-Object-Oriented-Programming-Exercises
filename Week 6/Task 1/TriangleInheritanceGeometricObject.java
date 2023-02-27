public class TriangleInheritanceGeometricObject {
    public static void main(String[] args) {
        Triangle triangle = new Triangle( "black", true, 4.2, 5.5, 4.2);
        System.out.println("Area is " + triangle.getArea());
        System.out.println("Perimeter is " + triangle.getPerimeter());
        System.out.println("Color is " + triangle.getColor());
        System.out.println("Triangle is filled? " + triangle.isFilled());
    }
}
