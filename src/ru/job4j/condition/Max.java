package ru.job4j.condition;

public class Max {
    public static int  max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        int tmp = max(left, right);
        return max(first, tmp);
    }

    public static int max(int left, int right, int first, int second) {
        int tnp = max(left, right, first);
        return max(second, tnp);
    }

    public static void main(String[] args) {
        int rsl = Max.max(2, 1);
        System.out.println(rsl);
    }
}
