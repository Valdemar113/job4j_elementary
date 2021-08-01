package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second)
                + div(first, second);

    }

    public static double sumsmrd(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета (сумма разности и деления двух чисел) равен : " + diffAndDiv(10, 5));
        System.out.println("Результат расчета (сумма вычисления всех четырех операций) равен : " + sumsmrd(10, 20));

    }

}
