package ru.stqa.pft.sandbox;

public class Points {
  public double x;
  public double y;


  public Points(double x1,double y2) {
    this.x = x1;
    this.y = y2;

  }
  public  double distance(Points p2) {
    return Math.sqrt((p2.x-this.x)*(p2.x-this.x)+(p2.y-this.y)*(p2.y-this.y));
  }
}
