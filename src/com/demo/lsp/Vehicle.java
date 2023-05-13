package com.demo.lsp;

import com.demo.without.lsp.*;

import java.util.*;

class Vehicle {
    private String name;
    private double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}

class FourWheeler extends Vehicle {

    public FourWheeler(String name, double speed) {
        super(name, speed);
    }

    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(String name, double speed) {
        super(name, speed);
    }
}

class Car extends FourWheeler {

    public Car(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + "name engine started.");
    }
}

class Bicycle extends TwoWheeler {
    public Bicycle(String name, double speed) {
        super(name, speed);
    }
}

class Race {
    private List<FourWheeler> fourWheelers;

    public Race() {
        fourWheelers = new ArrayList<>();
    }

    public void addVehicle(FourWheeler fourWheeler) {
        fourWheelers.add(fourWheeler);
    }

    public void startRace() {
        for (FourWheeler fourWheeler : fourWheelers) {
            fourWheeler.startEngine();

            System.out.println(fourWheeler.getName() + " is racing.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Race race = new Race();
        FourWheeler c= new Car("Ferrari", 200.0);

        race.addVehicle(c);
        TwoWheeler twoWheeler= new Bicycle("Harley-Davidson", 150.0);
        race.startRace();
    }
}