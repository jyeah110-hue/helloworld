package e260417;

import e260417.dll.Animal;
import e260417.dll.Cat;
import e260417.dll.Dog;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound1();
        cat.sound1();
        System.out.println("-----");

        Animal animal = null;
        animal = new Dog();
        animal.sound1();
        animal = new Cat();
        animal.sound1();
        System.out.println("-----");

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound1();
    }
}
