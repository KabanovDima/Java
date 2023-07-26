package Sem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
//        Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
//        целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        Реализуйте следующую логику:
//        1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
        checkArray(new Integer[] {1, 2, 4, 5, null, 6, 7, null, 8, 11, 25});
    }

    public static void checkArray(Integer[] args){
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if (args[i] == null){
                index.add(i);
            }
        }

//        IntStream.range(0, args.length).filter(i -> args[i] == null).forEach(index::add); // второй вариант for

        if (index.size() > 0){
            throw new RuntimeException("Next ceil is null: " + index);
        }
        System.out.println("Arrayis not contains null");
    }
}
