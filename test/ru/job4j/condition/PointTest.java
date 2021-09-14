package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to40then3() {
        double expected = 3;
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to60then4() {
        double expected = 4;
        Point a = new Point(2, 0);
        Point b = new Point(6, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to75then5() {
        double expected = 5;
        Point a = new Point(2, 5);
        Point b = new Point(7, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to66then565() {
        double expected = 5.65;
        Point a = new Point(2, 2);
        Point b = new Point(6, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when423to846then538() {
        double expected = 5.38;
        Point c = new Point(4, 2, 3);
        Point d = new Point(8, 4, 6);
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when579to975then565() {
        double expected = 5.65;
        Point c = new Point(5, 7, 9);
        Point d = new Point(9, 7, 5);
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);

    }
}