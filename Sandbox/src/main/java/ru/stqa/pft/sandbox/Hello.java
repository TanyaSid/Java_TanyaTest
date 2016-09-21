package ru.stqa.pft.sandbox;

public class Hello {
    public static void main(String[] args) {
        hello("world!!!!");
        hello("user!!!!");
        hello("Tanya!!!!");

        Square s= new Square(5);
        System.out.println("Площадь квадрата со стороной " +s.l+ " = " + s.area());

        Rectagle r = new Rectagle(4,6);


        System.out.println("Площадь прямоугольника со сторонами " +r.a+ " и " +r.b+ " = " +r.area());

    }

    public static void hello(String somebody)
    {
        System.out.println("Hello "+ somebody);
    }






}