package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testArea(){
        Point p4 =  new Point(0,0,3,4);
       // assert p4.distance() == 5;
        Assert.assertEquals(p4.distance(),5.0);
    }

}
