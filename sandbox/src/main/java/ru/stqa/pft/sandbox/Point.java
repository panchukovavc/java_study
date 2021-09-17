package ru.stqa.pft.sandbox;

public class Point {
  public static void main(String[] args) {//запускаемый класс,содержащий функцию

Points p = new Points (0,1,2,3); //создаем объект типа Points
    System.out.println("Расстояние между двумя точками =" + distance(p));//результат вычисления выводим на экран
  }

  public static double distance(Points p) { //функция,которая вычисляет расстояние между двумя точками
    return Math.sqrt((p.p3-p.p1)*(p.p3-p.p1)+(p.p4-p.p2)*(p.p4-p.p2));
  }
}
