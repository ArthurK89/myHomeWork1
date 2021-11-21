package Lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumIn(10, 11);
        numberCheck(-1);
        isNumber(-2);
        printWordsTimes("Это не плагиат!", 3);
        leapYearCheck(1989);
    }

    public static boolean checkSumIn(int a, int b) {
        return (a + b >= 10 && a<= 20);
    }

    public static void numberCheck(int a) {
        if (a < 0) {
            System.out.println("Введенное число отрицательное!");
        } else {
            System.out.println("Введенное число положительное!");
        }
    }

    public static boolean isNumber(int a) {
        if (a < 0) {
            return true;
        } else return false;
    }

    public static void printWordsTimes (String string , int a){
        for(int i=0; i<a; i++){
            System.out.printf("string\n"+ "!!");
        }
    }

    public static boolean leapYearCheck (int a){
        if( a%4==0 && a%400==0 && a%100 !=0 ){
            return true;
        } else return false;
    }
}