package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class WinLinesGame {

    static final char SYMB_X = 'X';
    static final char SYMB_O = 'O';
    static final char SYMB_FREE = '.';

    static char[][] field;
    static final int SIZE = 9;
    public static final int WINLINE = 5;
    public static Scanner sc = new Scanner(System.in);

    public WinLinesGame() {

    }


    Random random = new Random();

    public static void main(String[] args) {

        initField();
        printField();

        while (true) {

            playerMove();
            printField();
            if (checkWinLine(SYMB_X, WINLINE)) {
                System.out.println(" YOU WIN!!!");
                break;
            }
            if (noWins()) {
                System.out.println("Friendship Won!");
                break;
                ;
            }

            aiMove();
            printField();
            if (checkWinLine(SYMB_O, WINLINE)) {
                System.out.println(" YOU LOSE!!!");
                break;
            }
            if (noWins()) {
                System.out.println("Friendship Won!");
                break;
            }
        }
        System.out.println("Game is over! Try again!");
    }

    public static void initField() {
        field = new char[SIZE][SIZE];
        for (int horzn = 0; horzn < SIZE; horzn++) {
            for (int vert = 0; vert < SIZE; vert++) {
                field[horzn][vert] = SYMB_FREE;
            }
        }
    }

    public static void printField() {
        for (int horzn = 1; horzn < SIZE; horzn++) {
            for (int vert = 1; vert < SIZE; vert++) {
                System.out.print(field[horzn][vert] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void playerMove() {
        int horzn, vert;
        do {
            System.out.println("Ваш ход!Выберете строку,потом столбец, в формате 1 1 ,1 2,...");
            horzn = sc.nextInt() - 1;
            vert = sc.nextInt() - 1;
        } while (!isRightTurn(horzn, vert));
        field[horzn][vert] = SYMB_X;
    }

    public static boolean isRightTurn(int horzn, int vert) {
        if (horzn < 0 || horzn >= SIZE || vert < 0 || vert >= SIZE) {
            System.out.println("Такой ячейки нет, выберете другую...");
            return false;
        }
        if (field[horzn][vert] != SYMB_FREE) {
            System.out.println("Эта ячейка уже занята, выберете другую...");
            return false;
        }
        return true;
    }

    public static boolean noWins() {
        for (int horzn = 0; horzn < SIZE; horzn++) {
            for (int vert = 0; vert < SIZE; vert++) {

                if (field[horzn][vert] == SYMB_FREE)
                    return false;

            }
        }
        return true;
    }

    public static void aiMove() {
        for (int horzn = 0; horzn < SIZE; horzn++) {
            for (int vert = 0; vert < SIZE; vert++) {
                if (isRightTurn(horzn, vert)) {
                    field[horzn][vert] = SYMB_O;
                    if (checkWinLine('0', 5)) {
                        return;
                    }

                    field[horzn][vert] = '.';


                }
            }
        }
        for (int horzn = 0; horzn < SIZE; horzn++) {
            for (int vert = 0; vert < SIZE; vert++) {
                if (isRightTurn(horzn, vert)) {
                    field[horzn][vert] = SYMB_X;
                    if (checkWinLine('X', 5)) {
                        return;
                    }

                    field[horzn][vert] = '.';
                }
            }
        }
    }
}