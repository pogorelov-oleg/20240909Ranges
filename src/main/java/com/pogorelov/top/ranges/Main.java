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
        int[][] intRanges;//объявляем массив, где будут храниться все диапалоны в виде массива из 2 значений (начао и конец)

        //ввод пользователя
        intRanges = Ranges.userInputRange(nRange);
        System.out.println();

        //вывод информации (введенные диапазоны и их длина)
        Ranges.showRangesInfo(intRanges);


        System.out.println("Task02-Ranges");
        //выводим в консоль два диапазона, которые собираемся сравнить
        Ranges.printAllRange(intRanges[0]);
        Ranges.printAllRange(intRanges[1]);
        //выводим результат сравнения
        System.out.println(Ranges.checkIfValuesIntersect(intRanges[0], intRanges[1]) + "\n");

        //выводим в консоль два диапазона, которые собираемся сравнить
        Ranges.printAllRange(intRanges[0]);
        Ranges.printAllRange(intRanges[2]);
        //выводим результат сравнения
        System.out.println(Ranges.checkIfValuesIntersect(intRanges[0], intRanges[2]));
    }
}
