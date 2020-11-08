package ru.kotadmi.Laba1.Pr04;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,3);
        rectangle.setColor("Красный");
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square();
        square.setSide(5);
        square.setFilled(true);
        square.setColor("Голубой");
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle(6);
        circle.setColor("Белый");
        circle.setFilled(true);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}

