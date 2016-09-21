/**
 * Created by trodzina on 9/20/2016.
 */
package ru.stqa.pft.sandbox;

public class Distance
  {

    public static void main(String[] args)
    {

      PointClass p1 = new PointClass(4,7);
      PointClass p2 = new PointClass(10,15);


      System.out.println("Расстояние между точками с координатами " + p1.x +" и " +p1.y +
              " для первой точки и координатами "  + p2.x + " и " +p2.y +" для второй точки = "
              + PointClass.distance(p1,p2) );
    }


}