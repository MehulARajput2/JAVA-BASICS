class Animal
{
    void run()
    {
        System.out.println("Animal can run");
    }
}
class Dog extends Animal
{
    void run()
    {
        System.out.println("Dog can run");
    }
}
class Cat extends Animal
{
    void run()
    {
        System.out.println("Cat can run");
    }
}
class Rat extends Animal
{
    void run()
    {
        System.out.println("Rat can run");
    }
}

class MethodOverridingDemo
{
    public static void main(String args[])
    {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Rat r = new Rat();
        Animal ref;
        ref = a;
        ref.run();
        ref = d;
        ref.run();
        ref = c;
        ref.run();
        ref = r;
        ref.run();


    }
}