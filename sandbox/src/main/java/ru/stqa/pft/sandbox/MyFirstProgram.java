package ru.stqa.pft.sandbox;

public class MyFirstProgram {
 public static void main (String [] args) {
   hello("world");
   hello("User");
   hello("Valentina");

   double l =5; //обл видимости переменной это {}. значит переменная с именем l существует в функции  main
   System.out.println("Площадь квадрата со стороной " + l + "=" + area(l) ); //функция с одним параметром l

   double a = 4;
   double b = 6;
   System.out.println("Площадь прямоугольника со сторонами " + a  + "и" +  b  + "=" + area(a, b) ); // функция с двумя параметрами a b

 }

  public static void hello (String somebody) {
   System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len*len;
  }

  public static double area(double a, double b)  //для кажд переменной указывается ее тип. и перед именем функции указывается тип возвращаеого значения
  {
    return a * b;
  }


}