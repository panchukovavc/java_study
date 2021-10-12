package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    gotoAddNewPage();
    fillContactForm(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    submitContactCreation();
    returnToContactPage();
  }

}
