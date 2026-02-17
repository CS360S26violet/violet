package com.example.violet;

public class Square extends Shape {

    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getArea() {
        return sideLength * sideLength;
    }
}
