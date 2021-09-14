package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;

    }

    public static int max(int left, int right, int first) {
        return max(first, max(left, right));
    }

    public static int max(int left, int right, int first, int second) {
        return max(second, max(left, right, first));
    }

    public static void main(String[] args) {
        int rsl = Max.max(2, 1);
        System.out.println(rsl);
    }
}
