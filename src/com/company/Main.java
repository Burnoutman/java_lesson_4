package com.company;

public class Main {

    public static void main(String[] args) {

        Circle cr =new Circle(5);
        Square sq = new Square(2,3);
        System.out.println("Площадь круга S = "+cr.CircleS());
        System.out.println("Периметр круга L = "+cr.CircleL());
        if(sq.a==sq.b) {
            System.out.println("Площадь квадрата S = " + sq.SquareS());
            System.out.println("Периметр квадрата L = " + sq.SquareP());
        }
        else {

            System.out.println("Площадь прямоугольника S = " + sq.SquareS());
            System.out.println("Периметр прямоугольника L = " + sq.SquareP());
        }

    }
}
