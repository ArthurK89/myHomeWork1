package Lesson3;

import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {

    }

    public static void numInvert() {

        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
    }

    public static void hund() {

        int[] arr = new int[100];
        arr[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

    }

    public static void multiplyNumber() {

        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

    }

    public static int[][] factoryArr(int x) {
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            arr[i][i] = 1;
            arr[i][x - 1 - x] = 1;

        }
        return arr;
    }

    public static int[] twoArgs(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMinMax() {
        int[] array = new int[12];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);

        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];

                int max = array[0];
                for (int i = 0; i < array.length; i++) {
                    if (max > array[i]) {
                        max = array[i];

                    }


                }

            }
        }
    }

    public static boolean checkBalance(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        if (summ % 2 != 0) {
            return false;
        }

        int summRight = 0;
        int i = arr.length;
        i--;
        while (summRight < summ / 2) {
            summRight = summRight + arr[i];
        }
        return summRight == summ / 2;
    }

    public static int[] shiftArr(int arr, int n) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}
        int n = n % arr.length + arr.length;
        for (int i = 0; i < n; i++) {
            int shiftN = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];

            }
            shiftN = arr[0];

        }
        return arr;

    }
}