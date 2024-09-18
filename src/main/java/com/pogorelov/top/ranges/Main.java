package com.pogorelov.top.ranges;

/**
 * Task01
 * Создать программу, которая позволяет ввести с клавиатуры n диапазонов целочисленных значений (например,
 * 3-10). Каждый диапазон имеет начальную и конечную точку.
 * После ввода программа должна вывести длину каждого диапазона. Программа должна выводить сообщение об ошибке,
 * если начало диапазона больше, чем конец. Протестировать с
 * использованием JUnit.
 * Пример:
 * Входные данные: 3 6, -2 4, 11 15
 * Выходные 4, 7, 5
 * _____________________________________________________________________________________________________________
 * Task02
 * Для задания 1 добавить возможность проверки, пересекаются ли различные диапазоны значений.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Task01-Ranges");
        int nRange = 3;//указываем, сколько диапазонов хотим ввести
        int[][] rangesArray;//объявляем массив, где будут храниться все диапалоны в виде массива из 2 значений (начао и конец)

        //ввод пользователя
        rangesArray = Ranges.userInputRange(nRange);
        System.out.println();

        //вывод информации (введенные диапазоны и их длина)
        StringBuilder info = new StringBuilder("Имеются следующие диапазоны:\n");
        for (int[] range : rangesArray) {
            info.append(range[0]).append(" ").append(range[1]).append(" (длина диапазона - ")
                    .append(Ranges.getRangeLength(range[0], range[1])).append(")").append("\n");
        }
        System.out.println(info);

        System.out.println("Task02-Ranges");
        //выводим в консоль два диапазона, которые собираемся сравнить
        Ranges.printAllRange(rangesArray[0]);
        Ranges.printAllRange(rangesArray[1]);
        //выводим результат сравнения
        int[] valuesIntersect = Ranges.checkIfValuesIntersect(rangesArray[0], rangesArray[1]);
        if (valuesIntersect[0] == -1)
            System.out.println("Значения не пересекаются");
        else {
            System.out.print("Значения пересекаются: ");
            for (int element : valuesIntersect) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //выводим в консоль два диапазона, которые собираемся сравнить
        Ranges.printAllRange(rangesArray[0]);
        Ranges.printAllRange(rangesArray[2]);
        //выводим результат сравнения
        valuesIntersect = Ranges.checkIfValuesIntersect(rangesArray[0], rangesArray[2]);
        if (valuesIntersect[0] == -1)
            System.out.println("Значения не пересекаются");
        else {
            System.out.print("Значения пересекаются: ");
            for (int element : valuesIntersect) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
