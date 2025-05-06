class Students {
    int eno;
    String name;

    Students() {
        eno = 5;
        name = "mehul";
    }

    Students(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    Students(Students s) {
        this.eno = s.eno;
        this.name = s.name;
    }

    void print() {
        System.out.println("Enrolllment no=" + eno);
        System.out.println("Name=" + name);
    }
}

class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        Students s2 = new Students(3, "kdp");
        s2.print();
        Students s3 = new Students(s1);
        s3.print();
    }
}
