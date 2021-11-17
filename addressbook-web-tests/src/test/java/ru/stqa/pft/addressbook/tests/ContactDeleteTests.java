package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeleteTests extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    if(app.contact().list ().size()==0){
      app.contact().create(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    }
  }
  @Test
  public void testContactDelete (){
    List<ContactData> before =app.contact().list();
    int index =before.size()-1;
    app.contact().delete(index);
    List <ContactData> after =app.contact().list();
    Assert.assertEquals(after.size(),before.size() -1);

    before.remove(index);
    Assert.assertEquals(before, after);


  }


}
