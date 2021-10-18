package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeleteTests extends TestBase {
  @Test
  public void testContactDelete (){
    app.getNavigationHelper().selectContact();
    app.getNavigationHelper().deleteSelectContact();
    app.getNavigationHelper().closeAlert();
    app.getNavigationHelper().gotoHomePage();

  }
}
