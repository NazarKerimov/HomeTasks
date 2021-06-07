package com;

public class Square extends Shape {
    int squareOfShape;

    public Square(int length, int width, int squareOfShape) {
        super(length, width);
        this.length = length;
        this.width = width;
        this.squareOfShape = length * width;
    }

    public Square (Square square) {
        this.length = square.length;
        this.width = square.width;
    }

    void printSquare() {
        System.out.println(length);
        System.out.println(width);
        System.out.println(squareOfShape);
    }
}

