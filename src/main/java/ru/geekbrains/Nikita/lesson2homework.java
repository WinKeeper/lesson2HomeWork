package ru.geekbrains.Nikita;

import java.util.Arrays;

public class lesson2homework {
    public static void main(String[] args) {
        //Задание №1
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("    Задание №1:");
        System.out.println("До замены " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("После замены " + Arrays.toString(arr));

        //Задание №2
        int[] arr2 = new int[8];
        System.out.println("    Задание №2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 3;
        }
        System.out.println("Результат суммирования " + Arrays.toString(arr2));

        //Задание №3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("    Задание №3:");
        for (int i = 0; i < arr.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Результат умножения " + Arrays.toString(arr3));

        //Задание №4
        int[][] arr4 = new int[5][5];
        System.out.println("    Задание №4:");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if(i - j == 0 || i + j == arr4.length - 1) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
    }
}

