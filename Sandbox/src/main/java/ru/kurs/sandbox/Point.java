package ru.kurs.sandbox;

/**
 * Created by yana on 2/24/2016.
 */
public class Point {

    /*
     Поля для хранения координат.
    */
    private double x;
    private double y;

    /*
      Конструктор класса Point
    */
    public Point(double xx, double yy) {
        x = xx;
        y = yy;
    }

    /*
      статический метод класса Point для вычисления дистанции
    */
    public static double distance(Point p1, Point p2) {
        double dX = p1.x - p2.x;
        double dY = p1.y - p2.y;

        return Math.sqrt(dX * dX + dY * dY);
    }

    public double distanceTo(Point p) {
        double dX = this.x - p.x;
        double dY = this.y - p.y;

        return Math.sqrt(dX * dX + dY * dY);


    }

    /*
       запускающий метод

    */
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);

        double d1 = distance(point1, point2);

        double d2 = point1.distanceTo(point2);
        System.out.println("Расстояние между точками (" + point1.x + ", " + point1.y + ") и (" + point2.x + ", " + point2.y + ") = " + distance(point1,point2));
        System.out.println("Расстояние между точками  = " + d2);/*point1.distanceTo(point2));*/
    }
}
