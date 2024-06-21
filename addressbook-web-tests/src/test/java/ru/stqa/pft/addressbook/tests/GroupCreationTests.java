package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import ru.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goTo().groupPage();
        Set<GroupData> before =  app.group().all();
        GroupData group = new GroupData().withName("test2");
        app.group().create(group);
        Set<GroupData> after =  app.group().all();
        Assert.assertEquals(after.size(),before.size()+1);
        before.add(group);
        Assert.assertEquals(before,after);
    }
}
