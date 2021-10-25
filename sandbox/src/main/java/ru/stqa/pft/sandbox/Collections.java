package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {
 public static void main(String [] args){
   String[] langs = {"Java", "C#", "Python","PHP"};//создается эл который состоит из 4х элементов и заполняется указанными значениями.

   List <String> languages = Arrays.asList("Java","C#", "Python","PHP");


   for (String l : languages){
     System.out.println( "Я хочу выучить " +l);
   }

  }
}
