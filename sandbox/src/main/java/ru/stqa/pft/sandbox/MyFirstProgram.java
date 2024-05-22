package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
       Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        System.out.println(distance(p1,p2));
    }
    public static double distance(Point p1,Point p2){
        double dx = p2.x - p1.x;
        double dy = p2.y-p1.y;
       return Math.sqrt(dx*dx +dy*dy);
    }
}
