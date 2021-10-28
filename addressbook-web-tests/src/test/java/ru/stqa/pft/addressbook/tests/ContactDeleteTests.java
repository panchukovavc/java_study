package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeleteTests extends TestBase {
  @Test
  public void testContactDelete (){
    int before = app.getContactHelper().getContactCount();
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    }
    app.getNavigationHelper().selectContact();
    app.getNavigationHelper().deleteSelectContact();
    app.getNavigationHelper().closeAlert();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before -1);

  }
}
