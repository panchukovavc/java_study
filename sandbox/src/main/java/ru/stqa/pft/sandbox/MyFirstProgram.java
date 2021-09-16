package ru.stqa.pft.sandbox;

public class MyFirstProgram {
 public static void main (String [] args) {
   hello("world");
   hello("User");
   hello("Valentina");

   Square s =new Square(5); //создаем объект типа Square
   System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area() ); //функция с одним параметром l

   Rectangle r = new Rectangle(4,6);
   System.out.println("Площадь прямоугольника со сторонами " + r.a  + "и" +  r.b  + "=" + r.area() ); // функция с двумя параметрами a b

 }

  public static void hello (String somebody) {
   System.out.println("Hello, " + somebody + "!");
  }


}