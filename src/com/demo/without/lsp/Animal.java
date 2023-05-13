package com.demo.without.lsp;

import java.util.*;

//public class Animal {
//}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("Animal is speaking.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllAnimalsSpeak() {
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}

//class Main {
//    public static void main(String[] args) {
//        AnimalShelter shelter = new AnimalShelter();
//        shelter.addAnimal(new Dog("Buddy", 3, "Golden Retriever"));
//        shelter.addAnimal(new Cat("Whiskers", 2, "Black"));
//        shelter.makeAllAnimalsSpeak();
//    }
//}
