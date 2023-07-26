package Sem1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arrayForTask1 = {1, 2, 4, 5, 6, 7, 8, 11, 25};

        int[][] arrayForTask3 = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
        };

//        System.out.println(task1(arrayForTask1, 8));
//        consoleTask2();
//        System.out.println(task2(arrayForTask1, 8, 9));
//        System.out.println(task3(arrayForTask3));

    }

    public static int task1(int[] array, int min){
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторый
//        допустимый минимум.
//        Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
//        в качестве кода ошибки, иначе - длину массива.

        if(array.length < min){
            return -1;
        }
        return array.length;
    }
    public static int task2(int[] array, int val, int min){
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3

        if (array == null){
            return -3;
        }
        if(array.length < min){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == val){
                return i;
            }
        }
        return -2;
    }
//    ________________ TASK3_______________________________________
    public static int task3(int[][] array) {
//        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем
//        на метод 2 ограничения:
//        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
//        и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
//        метод должен бросить RuntimeException с сообщением об ошибке.

        if(isNotSquareArray(array)){
            throw new RuntimeException("Not Square Array");
        }
        if(isNotOneorZero(array)){
            throw new RuntimeException("Not contain One and Zero");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static boolean isNotOneorZero(int[][] array){
        List<Integer> container = List.of(0,1);
        return IntStream.range(0, array.length).anyMatch(i -> IntStream.range(0, array.length)
                .anyMatch(j ->!container.contains(array[i][j])));
    }
    public static boolean isNotSquareArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != array.length){
                return true;
            }
        }
        return false;
    }
//    ______________________________________________________________


}

