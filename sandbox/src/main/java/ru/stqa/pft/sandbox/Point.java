package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point otherPoint) {
        double dx = otherPoint.x - this.x;
        double dy = otherPoint.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
