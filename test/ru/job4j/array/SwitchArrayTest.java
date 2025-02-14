package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4To6() {
        int[] input = {6, 5, 4, 3, 2};
        int source = 0;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 5, 6, 3, 2};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void whenSwap5To4() {
        int[] input = {10, 5, 8, 4, 2 };
        int source = 1;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 4, 8, 5, 2};
        Assert.assertArrayEquals(expected, result);
    }

}