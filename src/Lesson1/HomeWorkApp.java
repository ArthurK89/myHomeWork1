package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(22,44);
        printColor(127);
        compareNumbers(32,-34);
    }
    public static void printThreeWords() {
        System.out.printf("Orange\n"+"Banana\n"+"Apple\n");

    }
    public static void checkSumSign(int a , int b) {
        int c = a + b;
        if (c > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(int value){
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers(int a,int b){
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}