package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by trodzina on 9/22/2016.
 */
public class PointDistanceTest
{

  @Test
  public void testDistance()
  {
    PointClass p1 = new PointClass(4,7);
    PointClass p2 = new PointClass(10,15);



    Assert.assertEquals(p1.distance(p1,p2),10.0);

  }

}
