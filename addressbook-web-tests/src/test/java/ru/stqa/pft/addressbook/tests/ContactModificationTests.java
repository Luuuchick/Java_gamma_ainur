package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends  TestBase{
    @Test
    public void testContactModification(){

        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Ainur1", "Dossan1",
                "87781062336",null),false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }

}
