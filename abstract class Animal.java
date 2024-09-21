abstract class Animal {
    Animal() {
        System.out.println("create animal");
    }

    protected void finalize() {
        System.out.println("delete animal");
    }

    abstract void sound();  // เมธอด abstract
}

class Dog extends Animal {
    Dog() {
        System.out.println("dog");
    }

    protected void finalize() {
        System.out.println("delete dog");
    }

    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("cat");
    }

    protected void finalize() {
        System.out.println("delete cat");
    }

    @Override
    void sound() {
        System.out.println("cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.sound();
        c.sound();
        
        d = null; c = null; // trigger garbage collection
        System.gc(); 
    }
}
