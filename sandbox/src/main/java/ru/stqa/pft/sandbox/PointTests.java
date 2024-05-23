package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class PointTests {
    @Test
            /* public void testArea(){
        Point p4 =  new Point(0,0,3,4);
       // assert p4.distance() == 5;
        Assert.assertEquals(p4.distance(),5.0);
    }*/
    public void testArea(){
            Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    double expectedDistance = 5.0; // Ожидаемое расстояние между точками (3,4) и (0,0)
    double actualDistance = p1.distance(p2);
    assertEquals(actualDistance, expectedDistance, 0.001, "Distance calculation is incorrect");
    }

}
