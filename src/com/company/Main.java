package com.company;

public class Main {

    public static void main(String[] args) {

        Circle cr =new Circle(5);
        Square sq = new Square(2,2);
        System.out.println("Площадь круга S = "+cr.CircleS());
        System.out.println("Периметр круга L = "+cr.CircleL());
        //Если стороны равны,то квадрат,если нет,то будет считать как прямоугольник
        if(sq.a==sq.b) {
            System.out.println("Площадь квадрата S = " + sq.SquareS());
            System.out.println("Периметр квадрата P = " + sq.SquareP());
        }
        else {

            System.out.println("Площадь прямоугольника S = " + sq.SquareS());
            System.out.println("Периметр прямоугольника P = " + sq.SquareP());
        }

    }
}
