package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase{
//   @Test
//    public void testContactCreation() {
//      // app.getNavigationHelper().gotoContactPage();
//        app.getContactHelper().initContactCreation();
//        app.getContactHelper().fillContactForm(new ContactData("Gulya", "Satbyeva",
//                "87781062336","test1"),true);
//        app.getContactHelper().submitContactCreation();
//        app.getContactHelper().returnToContactPage();
//
//    }
//    private ApplicationManager app1;

    @Test
    public void testContactCreation() {
        app.goTo().gotoContactPage();
        app.getContactHelper().createContact(new ContactData("test1", "gdhg","25522","kkkkl"));

    }
}

