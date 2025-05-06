class Animal {
    void run() {
        System.out.println("Animal can Run");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog can Run");
    }
}

class Cat extends Animal {
    void run() {
        System.out.println("Cat can Run");
    }
}

class Rat extends Animal {
    void run() {
        System.out.println("Rat can Run");
    }
}

class DMDDemo {
    public static void main(String[] args) {
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