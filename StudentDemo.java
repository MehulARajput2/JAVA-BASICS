class Student
{
    int enrollmentNo;
    String name;
    void set(int enrollmentNo,String name )
    {
        this.enrollmentNo=enrollmentNo;
        this.name=name;
    }
    void display()
    {
        System.out.println("Enrollment No :" +enrollmentNo);
        System.out.println("Name :" + name);
    }
}

class StudentDemo
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.set(7172,  "Mehul");
        s1.display();
        s2.set(7158,  "Meet");
        s2.display();
        s3.set(7102,  "Jainil");
        s3.display();
    }
}
