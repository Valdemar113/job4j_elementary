package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 >= 0 && x2 <= 7 && y1 >= 0 && y2 <= 7 && Math.abs(y2 - y1) == Math.abs(x2 - x1)) {
            rsl = Math.abs(x2 - x1);

        }

        return rsl;
    }

    public static void main(String[] args) {
        int result = ChessBoard.way(7, 7, 0, 0);
        System.out.println(result);

    }
}
