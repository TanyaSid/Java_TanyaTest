package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by trodzina on 9/22/2016.
 */
public class SquareTestTanya
{
  @Test
  public void testArea()
  {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
