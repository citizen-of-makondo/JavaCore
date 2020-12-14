package lesson1;

public class Main {
    public static void main(String[] args) {
        byte varByte = 5;
        short varShort = 10;
        int varInt = 15;
        long varLong = 1500000000000000000L;
        float varFloat = 15.4f;
        double varDouble = 15.98;
        char varChar = 'Z';
        String varString = "Александр";
        boolean varBoolean = true;

        // Задание 3
        double a = 5;
        double b = 4;
        double c = 15;
        double d = 20;
        double resultPoint3 = calculate(a, b, c, d);
        System.out.println("Решение примера a * (b + (c / d)) = " + resultPoint3);

        // Задание 4
        boolean resultPoint4 = calculateSumAndCheckBetween10and20(a, b);
        System.out.println("Сумма чисел входить в диапазон от 10 до 20: " + resultPoint4);

        // Задание 5
        checkPositiveNumber(varInt);

        //Задание 6
        boolean isPositiveNumber = checkPositiveNumberBool(b);
        System.out.println("Число отрицательное? " + isPositiveNumber);

        //Задание 7
        sayHello(varString);

        //Задание 8
        isLeapYear(2010);

    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println("Год не високосный");
            } else System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }

    private static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    private static boolean checkPositiveNumberBool(double b) {
        return (b >= 0) ? false : true;
    }

    private static void checkPositiveNumber(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    private static boolean calculateSumAndCheckBetween10and20(double a, double b) {
        return ((a + b) >= 10 && (a + b) <= 20) ? true : false;
    }

    private static double calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
}