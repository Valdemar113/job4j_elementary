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
    public void when4To6Then6() {
        int left = 4;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }
}