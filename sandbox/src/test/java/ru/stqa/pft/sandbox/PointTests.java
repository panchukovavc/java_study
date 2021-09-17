package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance(){
    Points p = new Points (0,1,2,1);
    Assert.assertEquals(p.distance(),2.0);

  }
}
