package Wipro.Trainingoops;

class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
  
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    public void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphosim {
    public static void main(String[] args) {
       // Animal myAnimal;

        Animal myAnimal = new Dog();
        Animal myAnimal2 = new Cat();
        myAnimal.sound();
        myAnimal2.sound(); 
    }
}

