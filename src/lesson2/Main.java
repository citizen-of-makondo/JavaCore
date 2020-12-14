package lesson2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // Задание 1
        exercise1();

        // Задание 2
        exercise2();

        // Задание 3
        exercise3();

        // Задание 4
        exercise4();

        // Задание 5
        exercise5();

        // Задание 6
        int[] arr = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        boolean equalityLeftAndRight = exercise6(arr);
        System.out.println(Arrays.toString(arr) + " -> " + equalityLeftAndRight);

        // Задание 7
        int[] arrEx7 = new int[]{1, 2, 3, 4, 5};
        int shift = 2;
        exercise7(arrEx7, shift);
    }

    private static void exercise7(int[] arr, int shift) {
        System.out.println("Задание 7");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < shift; ++i) {
            for (int j = 0; j < arr.length - 1; ++j) {
                // Не получилось выполнить задание без создания второго массива
            }
        }

        System.out.println("Массив со сдвигом на " + shift + ": " + Arrays.toString(arr));
    }

    private static boolean exercise6(int[] arr) {
        System.out.println("Задание 6");
        int[] rightArray = Arrays.copyOf(arr, arr.length);
        int[] leftArray = new int[rightArray.length - 1];

        for (int i = 0; i < rightArray.length - 1; ++i) {
            leftArray[i] = rightArray[i];
            int sumFromLeftArray = Arrays.stream(leftArray).sum();
            rightArray[i] = 0;
            int sumFromRightArray = Arrays.stream(rightArray).sum();
            if (sumFromLeftArray == sumFromRightArray) {
                return true;
            }
        }
        return false;
    }

    private static void exercise5() {
        System.out.println("Задание 5");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }

    private static void exercise4() {
        System.out.println("Задание 4");
        int[][] arr = new int[5][5];

        int i;
        int j;
        for (i = 0; i < arr.length; ++i) {
            for (j = 0; j < arr[i].length; ++j) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }

        for (i = 0; i < arr.length; ++i) {
            for (j = 0; j < arr.length; ++j) {
                System.out.printf("%2d ", arr[i][j]);
            }

            System.out.println();
        }

    }

    private static void exercise3() {
        System.out.println("Задание 3");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }

    private static void exercise2() {
        System.out.println("Задание 2");
        int[] arr = IntStream.range(0, 8).map((i) -> {
            return i * 3;
        }).toArray();
        System.out.println(Arrays.toString(arr));
    }

    private static void exercise1() {
        System.out.println("Задание 1");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println("Инверсированный массив: " + Arrays.toString(arr));
    }
}
