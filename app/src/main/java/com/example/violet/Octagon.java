package com.example.violet;

public class Octagon extends Shape {
    private double sideLength;

    public Octagon(int x, int y, double sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        // Area of regular octagon = 2 * (1 + sqrt(2)) * s^2
        return 2 * (1 + Math.sqrt(2)) * sideLength * sideLength;
    }

    public double getPerimeter() {
        return 8 * sideLength;
    }

    @Override
    public String toString() {
        return "Octagon{" +
                "x=" + x +
                ", y=" + y +
                ", sideLength=" + sideLength +
                '}';
    }
}
