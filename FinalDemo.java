final class Base
{
    void print()
    {
        System.out.println("Base class");
    }
}

class Derived extends Base
{
    void print()
    {
        System.out.print("Derived class");
    }
}

class FinalDemo
{
    public static void main(String args[])
    {
        Base b = new Base();
        b.print();
        Derived d = new Derived();
        d.print();
    }
}