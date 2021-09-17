package ru.stqa.pft.sandbox;

public class Point {
  public static void main(String[] args) {//запускаемый класс,содержащий функцию

Points p = new Points (0,1,2,3); //создаем объект типа Points
    System.out.println("Расстояние между двумя точками =" + p.distance());//используем метод в классе Points
  }


}
