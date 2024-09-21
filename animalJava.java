class Animal  { //classเป็นโครงสร้างที่ใช้ในการสร้างวัตถุ มันกำหนดคุณสมบัติและพฤติกรรมที่วัตถุจะมี , สามารถเปลี่ยนanimalให้เป็นabstract class ได้ แต่จะไม่สามารถสร้างobjectได้โดยตรง
    Animal() {
        System.out.println("create animal");
    }
    
    protected void finalize() {
        System.out.println("delete animal");
    }
    
    void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal { //subclass/derived classเป็นคลาสที่สืบทอดคุณสมบัติและพฤติกรรมจากsuperclass (คลาสแม่)
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

class Cat extends Animal { //inheritanceเป็นกลไกที่อนุญาตให้subclassได้รับคุณสมบัติและพฤติกรรมจากsuperclass เช่น Cat ได้สืบทอดคุณสมบัติและพฤติกรรมจาก Animal ทำให้ Cat สามารถใช้งานเมธอด sound()
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
        Animal a = new Animal(); //object สร้างขึ้นมาจากคลาส (คือ a, b, c) และแต่ละวัตถุที่สร้างขึ้นถือเป็นinstanceของคลาสนั้น
        Dog d = new Dog();
        Cat c = new Cat();
        
        a.sound(); //polymorphismเป็นความสามารถของวัตถุในการใช้methodดียวกันแต่มีพฤติกรรมที่แตกต่างกัน
        d.sound(); //เรียกใช้methodของวัตถุ (message)
        c.sound();
        
        a = null; d = null; c = null; // trigger garbage collection
        System.gc(); // optional
    }
}
