package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.gotoAddNewPage();
    app.fillContactForm(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    app.submitContactCreation();
    app.returnToContactPage();
  }

}
