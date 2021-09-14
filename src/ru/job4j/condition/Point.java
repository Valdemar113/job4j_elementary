package ru.job4j.condition;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return  Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));

    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(4, 2);
        Point b = new Point(8, 6);
        Point c = new Point(4, 2, 3);
        Point d = new Point(8, 4, 6);
        double dist3d = c.distance3d(d);
        double dist = a.distance(b);
        System.out.println(dist);
        System.out.println(dist3d);
    }

}
