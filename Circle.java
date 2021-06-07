package com;

 public class Circle extends Shape {

     int radius;
     String colourOfLine;

     public Circle(int radius, String colourOfLine) {
        this.radius = radius;
        this.colourOfLine = colourOfLine;
     }
     public Circle(Circle circle) {                       //Конструктор наследования
         this.radius = circle.radius;
         this.colourOfLine = circle.colourOfLine;
     }
     void print() {
         System.out.println(radius);
         System.out.println(colourOfLine);
     }
 }
