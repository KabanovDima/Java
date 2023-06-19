package Sem4_LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        arrayListDemo();

//        ArrayList<String> arraylist = new ArrayList<>();
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        timerAddFirst();
//        timerRemoveFromMiddle();
//        iteratorTask();

//        Stack LIFO, last in first out
//        add 123, pop 321
//        Queue FIFO, first in first out
//        add 123, pop 123

//        Queue<Integer> arrayDeque = new ArrayDeque<>();
//        Queue<Integer> linkedList = new LinkedList<>();
//
//        Deque<Integer> arrayDeque = new ArrayDeque<>();
//        Deque<Integer> linkedList = new LinkedList<>();
//
//        Stack<Integer> stack = new Stack<>();
//
//        Queue<String> queue;
//        Deque<String> deque;
//        PriorityQueue<String> priorityQueue;
//        Stack<String> stack;

//        arrayDeque.addFirst(1);
//        arrayDeque.addFirst(2);
//        arrayDeque.addFirst(3);
//        arrayDeque.addFirst(4);
//        arrayDeque.addFirst(5);
//        System.out.println(arrayDeque.pollFirst());
//        System.out.println(arrayDeque.pollFirst());
//        System.out.println(arrayDeque.peekFirst());
//        System.out.println(arrayDeque.pollFirst());
//        System.out.println(arrayDeque.pollFirst());
//        System.out.println(arrayDeque.pollFirst());



    }
    private static void iteratorTask(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 20, 23, 15, 10, 100, 1123));
        //удалить все числа, которые делятся на 10

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next % 10 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    static void arrayListDemo(){
        ArrayList<String> arraylist = new ArrayList<>(100);
        arraylist.add("1");
        arraylist.remove(0);
        System.out.println(arraylist.size());
    }

    private static void timerAddFirst(){
        int count = 100_000;
        // Хочу замерить время добавления 100_000 элементов в начало списков
        ArrayList<Integer> arrayList = new ArrayList<>();
        Runnable arrayListRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    arrayList.add(0, i);
                }
            }
        };
        long arrayListTimer = timer(arrayListRunnable);
        System.out.println("Время добавления " +  count + " элементов в ArrayList: " + arrayListTimer);

        LinkedList<Integer> linkedList = new LinkedList<>();
        Runnable linkedListRunnable = () -> {
            for (int i = 0; i < count; i++) {
                linkedList.add(0, i);
            }
        };
        long linkedListTimer = timer(linkedListRunnable);
        System.out.println("Время добавления " +  count + " элементов в LinkedList: " + linkedListTimer);
    }

    private static void timerRemoveFromMiddle(){
        int count = 1_000_000;
        int removeCount = count / 100;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }
        Runnable arrayListRemoveRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < removeCount; i++) {
                    int middleIndex = count / 2;
                    arrayList.remove(middleIndex);
                }
            }
        };
        long arrayListRemoveTimer = timer(arrayListRemoveRunnable);
        System.out.println("Время удаления " +removeCount + " элементов из ArrayList: " +arrayListRemoveTimer);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        Runnable linkedListRemoveRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < removeCount; i++) {
                    int middleIndex = count / 2;
                    linkedList.remove(middleIndex);
                }
            }
        };
        long linkedListRemoveTimer = timer(linkedListRemoveRunnable);
        System.out.println("Время удаления " +removeCount + " элементов из LinkedList: " +linkedListRemoveTimer);
    }

    private static long timer(Runnable runnable){
        long start = System.currentTimeMillis(); // кол-во миллисекунд которы прошли с 01.01.1970 по ГЕС0
        runnable.run();
        long end = System.currentTimeMillis();
        return end - start;
    }

}
