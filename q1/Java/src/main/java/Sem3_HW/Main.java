package Sem3_HW;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Collections.addAll(lists, random.nextInt(10));
        }
        System.out.println(lists);

        findMax1(lists);
        findMin1(lists);
        findMax2(lists);
        findMin2(lists);
        average(lists);
        delEven(lists);
    }
//Пусть дан произвольный список целых чисел.
//1) Найти максимальное значение
//2) Найти минимальное значение
//3) Найти среднее значение
//4) Нужно удалить из него чётные числа

    static void findMin1(ArrayList<Integer> lists){
        int min = lists.get(0);
        for (int i = 0; i < lists.size()-1; i++) {
            if(lists.get(i) < min){
                min = lists.get(i);
            }
        }
        System.out.println("Минимальное значение: " + min);
    }
    static void findMax1(ArrayList<Integer> lists){
        int max = lists.get(0);
        for (int i = 0; i < lists.size(); i++) {
            if(lists.get(i) > max){
                max = lists.get(i);
            }
        }
        System.out.println("Максимальное значение: " + max);
    }

    static void findMax2(ArrayList<Integer> lists){
        System.out.println("Макс. знач.: " + Collections.max(lists));
    }
    static void findMin2(ArrayList<Integer> lists){
        System.out.println("Мин. знач.: " + Collections.min(lists));
    }

    static void average(ArrayList<Integer> lists){
        int sum = 0;
        for (int i = 0; i < lists.size(); i++) {
            sum += lists.get(i);
        }
        System.out.println("Среднее арифметическое: " + sum/ lists.size());
    }

    static void delEven(ArrayList<Integer> lists){
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            if(lists.get(i) % 2 != 0){
                evenList.add(lists.get(i));
            }
        }
        System.out.println(evenList);
    }
}
