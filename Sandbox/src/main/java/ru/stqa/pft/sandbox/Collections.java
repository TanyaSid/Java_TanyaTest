package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by trodzina on 11/2/2016.
 */
public class Collections {

  public static void main (String[] args)
  {
    String[] langs = {"Java","C#","Python","PHP"};

    List<String> languagues = Arrays.asList("Java","C#","Python","PHP");

    for(String l : languagues)
    {
      System.out.println("Я хочу выучить " +l);
    }

  }
}
