package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeleteTests extends TestBase {
  @Test
  public void testContactDelete (){
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    }
    List<ContactData> before =app.getContactHelper().getContactList();
    app.getNavigationHelper().selectContact(before.size()-1);
    app.getNavigationHelper().deleteSelectContact();
    app.getNavigationHelper().closeAlert();
    app.getNavigationHelper().gotoHomePage();
    List <ContactData> after =app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() -1);

  }
}
