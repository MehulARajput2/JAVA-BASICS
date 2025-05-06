abstract class Shape
{
    abstract void area();
    
}
class Circle extends Shape
{
    double r;
    Circle(double r)
    {
        this.r = r;
    
    }
    void area()
    {
        double a = 3.14*r*r;
        System.out.println("Area of Cicle = " +a);
    }
}
class Triangle extends Shape
{
    double b;
    double h;
    Triangle(double b , double h)
    {
        this.b = b;
        this.h = h;
    }
    void area()
    {
        double a = 0.5*b*h;
         System.out.println("Area of Triangle = " +a);
    }
} 
class Rectangle extends Shape
{
    double l;
    double b;
    void Rectangle(double l , double b)
    {
        this.l = l;
        this.b = b;
    } 
    void area()
    {
        double a = l * b;
       System.out.println("Area of Rectangle = " +a);
    }
}

class AbstractDemo
{
    public static void main(String args[])
    {
        Shape ref;
        Circle c =new Circle(5);
        ref = c;
        ref.area();
        Triangle t = new Triangle(5,3);
        ref = t;
        ref.area();
       Rectangle r = new Rectangle();
       ref = r;
       ref.area();
    }
}
 
