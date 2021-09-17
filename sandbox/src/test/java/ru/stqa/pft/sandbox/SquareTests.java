package ru.stqa.pft.sandbox; // создали пакет

import org.testng.Assert;
import org.testng.annotations.Test; //импорт классов

public class SquareTests {//создали новый класс SquareTests
  @Test//аннотация
  public void testArea(){
    Square s = new Square(5); //создадим новый квадрат
    //assert s.area () ==25;//проверим, что площадь квадрата =25
    Assert.assertEquals(s.area(),25);//для более подробного сообщения об ошибке используем функцию Assert.assertEquals
  }
}
