package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.model.GroupData;


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
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().createContact(new ContactData("test1", "gdhg","25522","kkkkl"));

    }
}

