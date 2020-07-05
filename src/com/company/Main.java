package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rect =new Rectangle(4,2);
        Square sq =new Square(3);
        System.out.println("Площадь прямоугольника: "+rect.calculateArea());
        System.out.println("Периметр прямоугольника: "+rect.calculatePerimeter());

        System.out.println("Площадь квадрата: "+sq.calculateArea());
        System.out.println("Периметр квадрата: "+sq.calculatePerimeter());

    }
}