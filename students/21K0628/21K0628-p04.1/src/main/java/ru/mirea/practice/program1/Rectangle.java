package ru.mirea.practice.program1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + ", b=" + b + '}';
    }
}