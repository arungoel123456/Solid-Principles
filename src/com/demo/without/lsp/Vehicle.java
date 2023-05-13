package com.demo.without.lsp;

import java.util.*;

//public class Vehicle {
//}

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

    public void startEngine() {
        System.out.println("Engine started.");
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String name, double speed, int numDoors) {
        super(name, speed);
        this.numDoors = numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String name, double speed, boolean hasSideCar) {
        super(name, speed);
        this.hasSideCar = hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Motorcycles cannot start engines.");
    }
}

class Race {
    private List<Vehicle> vehicles;

    public Race() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void startRace() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            System.out.println(vehicle.getName() + " is racing.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Race race = new Race();
        race.addVehicle(new Car("Ferrari", 200.0, 2));
        race.addVehicle(new Motorcycle("Harley-Davidson", 150.0, false));
        race.addVehicle(new Car("b", 200.0, 2));
        race.startRace();
    }
}