class This
{
    int a;
    void set(int a)
    {
        this.a=a;
    }
    void print()
    {
        System.out.println("a = " +a);
    }
}

class ThisDemo
{
    public static void main(String[] args) 
    {
        This t1 = new This();
        t1.set(50);
        t1.print();

        This t2 = new This();
        t2.set(100);
        t2.print();

        This t3 = new This();
        t3.set(150);
        t3.print();
        
    }
}