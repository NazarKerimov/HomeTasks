package com;

public class MainClass {
    public static void main(String[] args) {
        Circle shape1 = new Circle(20, "red");
        Circle shape11 = new Circle(shape1);  // вызываю конструктор копирования
        shape1.print();
        System.out.println("__________");
        shape11.print();                      // проверяю на корректность
        System.out.println("__________");
        shape11.colourOfLine = "blue";        // задаю новый параметр "colourOfLine"
        shape11.print();
        System.out.println("__________");
        Square shape2 = new Square(5, 5, 0);
        shape2.printSquare();
        System.out.println("__________");
        Cube shape3 = new Cube(7, 7, 7, 0);
        shape3.printOfCube();
    }
}
