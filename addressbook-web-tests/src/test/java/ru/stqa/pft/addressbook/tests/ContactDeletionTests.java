package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase{
//    @Test
//    public void testGroupDeletion() throws Exception {
//        app.getNavigationHelper().gotoGroupPage();
//        app.getGroupHelper().selectGroup();
//        app.getGroupHelper().deleteSelectedGroups();
//        app.getGroupHelper().returnToGroupPage();
//    }
@Test
public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoContactPage();
    if(!app.getContactHelper().isThereAGroup()){
        app.getContactHelper().createContact(new ContactData("test1",null,null,null));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().returnToContactPage();
}

}
