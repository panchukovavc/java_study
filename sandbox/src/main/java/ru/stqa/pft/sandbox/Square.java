package ru.stqa.pft.sandbox;

public class Square {
  public double l;
  public Square(double l){
    this.l=l;
  }
  public  double area() {//создаем метод, который ассоциируется с объектом
    return this.l * this.l;
  }
}
