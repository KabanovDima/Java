package Sem_6_Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        System.out.println(testClass);
//        System.out.println(testClass.hashCode());
//        ex_0();
//        ex_1();
//        ex_2();
    }

    static void ex_0(){
        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть",
                "Семь", "Восемь", "Девять", "Десять",
                "Один", "Один", "Десять");
        System.out.println(new HashSet<>(data));
        System.out.println(new LinkedHashSet<>(data));
        System.out.println(new TreeSet<>(data));
    };
    static void ex_1(){
//        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 1000
//        2. Создать метод, в который передайте заполненный выше массив и с помощью SET вычислите процент уникальных значений
//            в данном массиве и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

        int arrayCapacity = 1000;
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayCapacity; i++) {
            array.add(random.nextInt(1001));
        }
//        System.out.println(array);
        System.out.println(array.size());

        Set set = new HashSet(array);
//        System.out.println(set);
        System.out.println(set.size());

        System.out.println("Процент уникальных чисел в массиве: " + (set.size()*100*1.0) / array.size() + "%");

    }
    static void ex_2(){
//        1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//        а) информационной системой ветеринарной клиники
//        б) архивом выставки котов
//        в) информационной системой Театра кошек Ю. Д. Куклачёва
//        Можно записать в текстовом виде, не обязательно реализовывать в java.
//
//        1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные
//           поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
//        2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и
//           возраст (или другие параметры на ваше усмотрение).

        Cats cat1 = new Cats();
        cat1.setName("Васька");
        cat1.setColour("Рыжий");
        cat1.setBreed("Британец");
        System.out.println(cat1.getName());
        System.out.println(cat1.getColour());
        System.out.println(cat1.getBreed());
        System.out.println(cat1);

        Cats cat2 = new Cats("Васька", "Рыжий", "Британец");
        System.out.println(cat2);

        System.out.println(cat1.equals(cat2));

    }

}
