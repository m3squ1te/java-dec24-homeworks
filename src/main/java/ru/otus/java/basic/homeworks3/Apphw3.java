package ru.otus.java.basic.homeworks3;

public class Apphw3 {

    public static void main(String[] args) {
        greetings();
        checkSign(10, 15, -50);
        selectColor();
        compareNumbers(11, 13);
        addOrSubtractAndPrint(10, 15, false);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");

    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 11;
        if (data < 10) ;
        {
            System.out.println("Красный");
        }
        if (data > 11) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int sum;
        int sum1;
        if (increment == true) {
            sum = initValue + delta;
            System.out.println(sum);
        }
        if (increment == false) {
            sum1 = initValue - delta;
            System.out.println(sum1);
        }
    }
}