package Sem3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//    listTest();
//    ex_0();
//    ex_1();
//    ex_2();
        ex_3();
    }

    static void ex_0(){
//        Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println("---");
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }

    static void ex_1(){
//        Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.
        
        // List<Integer> integers = List.of(); // List.of возвращает иммутабельную коллекцию, которую нельзя изменять. Подходит для печати.
        List<Integer> integers = new ArrayList<>();
        // Collections.addAll(integers, 5, 7, 8, 9, 1, 3, 4, 0); // используем класс collections с методом заполнения.
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.print(integers + " ");
        System.out.println();
        integers.sort(Comparator.naturalOrder()); // сортировка компаратором
        System.out.print(integers + " ");
        System.out.println();
        Collections.sort(integers); // сортировка через класс Collections
        System.out.print(integers + " ");
    }

    static void ex_2(){
//  2.1 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//  Вывести название каждой планеты и количество его повторений в списке.
//  2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

        List<String> planets = List.of("Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluton");
        List<String> randomPlanets = new ArrayList<>();
        List<String> newPlanets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomPlanets.add(planets.get(random.nextInt(planets.size())));
            //либо можно так:
            //int randIndex = random.nextInt(planets.size());
            //String randString = planets.get(randIndex);
            //randomPlanets.add(randString);
        }
        System.out.println(randomPlanets);

        for (String w: planets) {
            System.out.println(w+ ": " + Collections.frequency(randomPlanets, w));
        }

        for (Integer i = 0; i < randomPlanets.size(); i++) {
            if(!newPlanets.contains(randomPlanets.get(i))){
                newPlanets.add(randomPlanets.get(i));
            }
        }

//        for (int i = 0; i < planets.size(); i++) {
//            for (int j = i+1; j < randomPlanets.size(); j++) {
//                if(planets.get(i).equals(randomPlanets.get(j))){
//                    randomPlanets.remove(randomPlanets.get(j));
//                }
//            }
//        }
        System.out.println(newPlanets);
    }

    static void ex_3(){

//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.

        List<String> strings = List.of("4", "qwe", "5", "8", "hello");
        int sum = 0;
        for (String string : strings) {
            try {
                sum += Integer.parseInt(string);
            }catch(NumberFormatException e){
                System.err.println("невозможно перевести в число: " + string);
            }
        }
        System.out.println("sum: " + sum);
    }

    static void listTest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0,1);
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
        System.out.print(list);

        Integer[] ints2 = list.toArray(new Integer[]{}); // переводим Лист в массив интеджеров
    }
}
