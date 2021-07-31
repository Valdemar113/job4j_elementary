package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumandmultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumandmultiply(10, 20));
        System.out.println("Результат расчета (сумма разности и деления двух чисел) равен : " + sumrazndiv(10, 5));
        System.out.println("Результат расчета (сумма вычисления всех четырех операций) равен : " + sumsmrd(10, 20));

    }

    public static double sumrazndiv(double first, double second) {
        return razn(first, second)
                + div(first, second);

    }

    public static double sumsmrd(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + razn(first, second)
                + div(first, second);
    }
}
