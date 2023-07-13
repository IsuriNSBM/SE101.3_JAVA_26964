
package com.mycompany.lab08;
abstract class Shape {
     public abstract double calculateArea();
  
    public void display() {
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;
  
    public Circle(double radius) {
        this.radius = radius;
    }
  
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
  
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
  
    @Override
    public double calculateArea() {
        return length * width;
    }
}

    

