class Rectangle {
    double height;
    double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.5, 1.5);
        Rectangle r2 = new Rectangle(0.2, 0.3);

        System.out.println(r1.height);
        System.out.println(r1.width);
        System.out.println(r2.height);
        System.out.println(r2.width);

    }
}
