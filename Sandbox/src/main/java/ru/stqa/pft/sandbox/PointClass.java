package ru.stqa.pft.sandbox;

/**
 * Created by trodzina on 9/21/2016.
 */
public class PointClass {


  public double x;
  public double y;



  public PointClass(double x, double y)
  {

this.x=x;
this.y=y;

  }

  public static double distance(PointClass p1, PointClass p2)
  {
    double AB = Math.sqrt((p2.x -p1.x) * (p2.x -p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    return AB;

  }

}

