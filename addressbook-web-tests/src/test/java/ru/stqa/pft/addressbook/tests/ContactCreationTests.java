package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;


public class ContactCreationTests extends TestBase{
    @Test
    public void testContactCreation() {
//        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Ainur2", "Dossan2",
                "87781062336","test1"),true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactPage();

    }
    private ApplicationManager app1;
    
}

