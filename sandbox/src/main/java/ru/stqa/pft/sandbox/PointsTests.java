package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class PointsTests {
    @Test
    public void testArea() {
        Point p4 = new Point(0, 0);
        Point p5 = new Point(3, 4);
        assert p4.distance(p5) == 5;
        Point p6 = new Point(0, 0);
        Point p7 = new Point(3, 4);
        assert MyFirstProgram.distance(p6, p7) == 5;
    }

}
