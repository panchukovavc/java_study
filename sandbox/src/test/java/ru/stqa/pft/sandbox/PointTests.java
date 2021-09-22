package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance(){
    Points p1 = new Points (10,10);
    Points p2 = new Points(2,4);
    Assert.assertEquals(p1.distance(p2),10.0);

  }
}
