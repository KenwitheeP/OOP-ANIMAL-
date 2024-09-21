class Animal:
    def __init__(self):
        print("create animal")
    
    def __del__(self):
        print("delete animal")
    
    def sound(self):
        print("animal makes a sound")

class Dog(Animal):
    def __init__(self):
        super().__init__()
        print("dog")
    
    def __del__(self):
        print("delete dog")
    
    def sound(self):
        print("dog barks")

class Cat(Animal):
    def __init__(self):
        super().__init__()
        print("cat")
    
    def __del__(self):
        print("delete cat")
    
    def sound(self):
        print("cat meows")

# Create objects
a = Animal()
d = Dog()
c = Cat()

a.sound()
d.sound()
c.sound()

# Delete objects
del a
del d
del c
