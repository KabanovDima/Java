package Sem1_HW;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        int[] arrForTask4 = new int[] {1, 2, 3, 4};
        task4(arrForTask4, 3);

    }

    //    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    static void task1() {
        int[] arr = new int[]{3, 6, 9, 12};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }


//    2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы
//    таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    static void task2() {
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter the size of array: ");
        int x = scan.nextInt();
        int[][] arr = new int[x][x];
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - 1 - i] = 1;
            arr[i][i] = 1;
        }
        print2DArray(arr);
    }

    static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//            "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//            "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//            "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//            "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scan.nextLine();
        int time = (new Date()).getHours();
        if (time >= 5 && time < 12) {
            System.out.printf("Good morning, %s!", name);
        }
        if (time >= 12 && time < 18) {
            System.out.printf("Good day, %s!", name);
        }
        if (time >= 18 && time < 23) {
            System.out.printf("Good evening, %s!", name);
        }
        if (time >= 23 && time < 5 || time == 0) {
            System.out.printf("Good night, %s!", name);
        }
    }

    //4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//      или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//        Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//        [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//        При каком n в какую сторону сдвиг можете выбирать сами.


    static void task4(int[] arr, int x){
        print1DArray(arr);
        if(x < 0) {
            do {
                for (int i = 0; i < arr.length - 1; i++) { //2341
                    int temp2 = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp2;
                }
                x++;
            } while (x < 0);
            print1DArray(arr);
        }else {
            do {
                for (int i = 0; i < arr.length - 1; i++) {
                    int temp3 = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = arr[arr.length - 1 - (i + 1)];
                    arr[arr.length - 1 - (i + 1)] = temp3;
                }
                x--;
            }while(x > 0);
            print1DArray(arr);
        }
    }

    static void print1DArray(int[] arr){
        for (int i:arr) {
            System.out.print(i);
        }
        System.out.println();
    }


}

