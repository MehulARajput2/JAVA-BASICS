class Shape {
    double area(double radius) 
    {
        return 3.14 * radius * radius; // Circle area
    }

    double area(double length, double width) 
    {
        return length * width; // Rectangle area
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Area of circle = " + s.area(3));
        System.out.println("Area of rectangle = " + s.area(5, 3));
    }
}
