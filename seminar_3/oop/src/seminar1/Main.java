package seminar1;

import seminar1.child.Dog;
import seminar1.child.Duck;
import seminar1.parent.Animal;
import seminar1.child.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("������", "�����");

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("������", 2);
        System.out.println(duck);
        Dog dog = new Dog("�����", "�����");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(animal);
        animals.forEach(Animal::speak);
        System.out.println("--------�������------------");

        for (Animal a: animals) {
            if (a instanceof Duck) {
                ((Duck) a).fly();
            }
        }
        System.out.println("--------�����------------");

        vaska.hunt();
    }
}
