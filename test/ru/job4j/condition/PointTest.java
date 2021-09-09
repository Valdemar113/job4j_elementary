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

}