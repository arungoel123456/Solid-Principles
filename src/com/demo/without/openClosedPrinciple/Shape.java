package com.demo.without.openClosedPrinciple;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double calculateArea() {
        double area = 0.0;
        if (type.equals("circle")) {
            double radius = 5.0;
            area = Math.PI * Math.pow(radius, 2);
        } else if (type.equals("rectangle")) {
            double width = 5.0;
            double height = 10.0;
            area = width * height;
        } else if (type.equals("triangle")) {
            double base = 5.0;
            double height = 10.0;
            area = 0.5 * base * height;
        }
        return area;
    }
}