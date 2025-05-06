interface Animal
{
    void eat();
}
interface Sound
{
    void makeSound();
}
class Dog implements Animal,Sound
{
    public void eat()
    {
        System.out.println("Dog can eat");
    }
    public void makeSound()
    {
        System.out.println("Dog can make sound ");
    }
    void run()
  {
        System.out.println("Dog can run");
  }
    
}

class InterfaceDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();
        d.makeSound();
        d.run();
    }
}