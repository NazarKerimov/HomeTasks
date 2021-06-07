package com;

public class Cube extends Shape{
    int cubeOfCube;
    int height;


    public Cube(int length, int width, int height, int cubeOfCube) {
        super(length, width);
        this.length = length;
        this.width = length;
        this.height = height;
        this.cubeOfCube = length * width * height;
    }
    void printOfCube() {
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);
        System.out.println(cubeOfCube);
    }
}
