# OOP-ANIMAL-
การเขียนOOP ใน Java, C++, Python 
https://app.gitbook.com/invite/7sYEuoeOfMjsmH0IeqDm/T6fI05jfc4JjrewY7Qyp


เปรียบเทียบ OOP ใน Java, C++, Python
// Java
class Animal {
    Animal() {
        System.out.println("create animal");
    }

    void sound() {
        System.out.println("animal makes a sound");
    }

    protected void finalize() {
        System.out.println("delete animal");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("create dog");
    }

    @Override
    void sound() {
        System.out.println("dog barks");
    }

    protected void finalize() {
        System.out.println("delete dog");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("create cat");
    }

    @Override
    void sound() {
        System.out.println("cat meows");
    }

    protected void finalize() {
        System.out.println("delete cat");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.sound();
        d.sound();
        c.sound();
        
        // Explicitly calling garbage collection for demonstration
        a = null;
        d = null;
        c = null;
        System.gc(); 
    }
}
// C++
#include <iostream>
#include <string>

class Animal {
public:
    Animal() {
        std::cout << "create animal" << std::endl;
    }

    virtual void sound() {
        std::cout << "animal makes a sound" << std::endl;
    }

    virtual ~Animal() {
        std::cout << "delete animal" << std::endl;
    }
};

class Dog : public Animal {
public:
    Dog() {
        std::cout << "create dog" << std::endl;
    }

    void sound() override {
        std::cout << "dog barks" << std::endl;
    }

    ~Dog() {
        std::cout << "delete dog" << std::endl;
    }
};

class Cat : public Animal {
public:
    Cat() {
        std::cout << "create cat" << std::endl;
    }

    void sound() override {
        std::cout << "cat meows" << std::endl;
    }

    ~Cat() {
        std::cout << "delete cat" << std::endl;
    }
};

int main() {
    Animal* a = new Animal();
    Dog* d = new Dog();
    Cat* c = new Cat();

    a->sound();
    d->sound();
    c->sound();

    delete a;
    delete d;
    delete c;

    return 0;
}

#Python
class Animal:
    def __init__(self):
        print("create animal")

    def sound(self):
        print("animal makes a sound")

    def __del__(self):
        print("delete animal")

class Dog(Animal):
    def __init__(self):
        super().__init__()
        print("create dog")

    def sound(self):
        print("dog barks")

    def __del__(self):
        print("delete dog")
        super().__del__()

class Cat(Animal):
    def __init__(self):
        super().__init__()
        print("create cat")

    def sound(self):
        print("cat meows")

    def __del__(self):
        print("delete cat")
        super().__del__()

if __name__ == "__main__":
    a = Animal()
    d = Dog()
    c = Cat()

    a.sound()
    d.sound()
    c.sound()

    # Explicitly deleting objects 
    del a
    del d
    del c

จากตัวอย่าง
ความเหมือน
แนวคิดพื้นฐาน: ทั้งJava, C++, Python มีแนวคิดหลักของ OOP เหมือนกัน คือ Class (ต้นแบบของวัตถุ), Object (สิ่งที่ถูกสร้างมาจาก class ประกอบด้วย field และ method) และมีคุณสมบัติของการเขียนโปรแกรมแบบ OOP คือ Inheritance, Encapsulation และ polymorphism
การใช้ Constructor และ Destructor: ทั้งสามภาษามีการใช้ constructor เพื่อสร้าง objects และทำการกำหนดค่าเริ่มต้น ในขณะที่ destructor ใช้ในการทำความสะอาดหน่วยความจำเมื่อ objects ถูกลบ
การ Override Method: ทั้งสามภาษาให้ subclass สามารถ override method จาก superclass เพื่อให้มีพฤติกรรมเฉพาะ
ความแตกต่าง
การจัดการหน่วยความจำ: 
Java: ใช้ Garbage Collection ที่ทำงานโดยอัตโนมัติ 
C++: ต้องจัดการหน่วยความจำด้วยตนเอง โดยใช้ new และ delete
Python: มี Garbage Collection และใช้การอ้างอิงแบบอัตโนมัติ แต่สามารถใช้คำสั่ง del เพื่อลบ objects ได้
การประกาศประเภทข้อมูล: 
Java: ใช้ Static Typing ซึ่งต้องประกาศประเภทของตัวแปร เกิดขึ้นในช่วงเวลาเขียนโปรแกรม โดยประเภทข้อมูลจะถูกตรวจสอบก่อนที่จะรันโปรแกรม
C++: สามารถประกาศได้ทั้ง Static Typing และ Dynamic Typing แต่ส่วนใหญ่ใช้ Static Typing.
Python: ใช้ Dynamic Typing ซึ่งไม่ต้องประกาศประเภทข้อมูลล่วงหน้า ทำให้โค้ดมีความยืดหยุ่นและกระชับ แต่ข้อผิดพลาดเกี่ยวกับประเภทข้อมูลอาจไม่ถูกตรวจจับจนกว่าจะรันโปรแกรม
Syntax และความอ่านง่าย: 
Java: มี syntax ที่ค่อนข้างเข้มงวดและต้องประกาศประเภทให้ชัดเจน
C++: มีความยืดหยุ่น แต่ก็ซับซ้อนกว่า Python เนื่องจากมีฟีเจอร์หลากหลาย เช่น template, operator overloading (ช่วยให้การใช้งานอ็อบเจกต์มีความยืดหยุ่นมากขึ้น)
Python: Syntax ที่อ่านง่ายและเข้าใจง่ายกว่า ซึ่งทำให้การเรียนรู้และพัฒนาโปรแกรมเป็นไปได้ง่าย
การเรียกใช้งานฟังก์ชัน: 
Java: ใช้ System.gc() เพื่อเรียก Garbage Collection แบบเป็นทางการ.
C++: การทำลายอ็อบเจกต์ทำได้โดยการเรียกใช้ delete
Python: การทำลายอ็อบเจกต์จะเกิดขึ้นอัตโนมัติเมื่อไม่มีการอ้างอิงอีกต่อไป หรือเมื่อใช้ del
Summary: การเปรียบเทียบ OOP ใน Java, C++, Python จะเห็นได้ว่าทั้งสามภาษาใช้แนวคิดพื้นฐานที่คล้ายคลึงกัน แต่มีวิธีการจัดการหน่วยความจำ, การประกาศประเภทข้อมูล, และ syntax ที่แตกต่างกัน
​
