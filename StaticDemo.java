class StaticDemo 
{
    int a;
    static  int i;
    static
    {
        System.out.println("This is Static block");
    }   
    void print()
    {
        System.out.println("a=" +a);
        System.out.println("i=" +i);
    }
    static void increment()
    {
        i++;
    }
    public static void main(String[] args) 
    {
        StaticDemo sd1= new StaticDemo();
        sd1.increment();
        sd1.print();
        StaticDemo sd2 = new StaticDemo();
        sd2.increment();
        sd2.print();
            
    }
}
