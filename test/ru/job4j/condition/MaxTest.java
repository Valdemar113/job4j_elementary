package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5to3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax4To6Then6() {
        int left = 4;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To4Then4() {
        int left = 1;
        int right = 2;
        int first = 3;
        int second = 4;
        int result = Max.max(left, right, first, second);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To7Then7() {
        int left = 1;
        int right = 7;
        int first = 6;
        int second = 3;
        int result = Max.max(left, right, first, second);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}