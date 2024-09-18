package com.pogorelov.top.ranges;

import java.util.Scanner;

public class Ranges {
    /**
     * Метод запрашивает у пользователя значения начала и конца диапазона и добавляет их в массив массивов
     * из двух элементов, где [0] - начало диапазона и [1] - конец диапазона.
     * Колличесто диапазонов указывается в аргументах метода.
     */
    public static int[][] userInputRange(int nRange) {
        Scanner sc = new Scanner(System.in);
        int[][] rangesArray = new int[nRange][];
        String userInput;
        int startValue;
        int finalValue;
        int i = 0;

        while (i < nRange) {
            System.out.print("Введите введите начальное и конечное значение для диапазона через пробел: ");
            userInput = sc.nextLine();

            if (!userInput.matches("-?\\d+\\s+-?\\d+"))
                System.out.println("ОШИБКА! Вы ввыели некорректные данные.");
            else {
                startValue = Integer.parseInt(userInput.split("\\s+")[0]);
                finalValue = Integer.parseInt(userInput.split("\\s+")[1]);

                if (getRangeLength(startValue, finalValue) == -1) {
                    continue;
                } else {
                    rangesArray[i] = new int[]{startValue, finalValue};
                    i++;
                }
            }
        }
        return rangesArray;
    }

    /**
     * Метод принимает принимает значения начала и конца диапазона и возвращает его длину.
     */
    public static int getRangeLength(int startValue, int finalValue) {
        if (finalValue - startValue < 0) {
            System.out.println("\"ОШИБКА! Начало диапазона больше чем конец.");
            return -1;
        }
        return finalValue - startValue + 1;
    }

    /**
     * Метод проверяет, пересекаются ли значения двух диапазонов. Результат выводится в консоль.
     */
    public static String checkIfValuesIntersect(int[] rangeA, int[] rangeB) {
        int min = Math.max(rangeA[0], rangeB[0]);
        int max = Math.min(rangeA[1], rangeB[1]);
        StringBuilder sb = new StringBuilder();

        if (min > max) return "Значения не пересекаются";
        else {
            sb.append("Значения пересекаются: ");
            for (int i = min; i <= max; i++) {
                sb.append(i).append(" ");
            }
            return sb.toString();
        }
    }

    /**
     * Метод выводит в консоль весь диапазон чисел.
     */
    public static void printAllRange(int[] range) {
        for (int i = range[0]; i <= range[1]; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}