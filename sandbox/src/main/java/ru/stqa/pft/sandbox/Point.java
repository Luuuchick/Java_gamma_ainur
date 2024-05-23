package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;
    public double x1;
    public double y1;
 public Point(double x,double y,double x1,double y1){
     this.x = x;
     this.y =y;
     this.x1 = x1;
     this.y1 =y1;
 }
 public Point(double x, double y){
     this.x= x;
     this.y =y;
 }
 public double distance(){
     double dx = this.x1 - this.x;
     double dy = this.y1-this.y;
     return Math.sqrt(dx*dx +dy*dy);

}
}
