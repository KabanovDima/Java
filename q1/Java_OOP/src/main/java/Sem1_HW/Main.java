package Sem1_HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animals> listAnimals = new ArrayList<>();
        listAnimals.add(new Cat("Vasya", 2));
        listAnimals.add(new Cat("Murzik", 6));
        listAnimals.add(new Dog("Cesar", 9));
        listAnimals.add(new Dog("Bobik", 3));

        doSomethink(listAnimals, 1);
    }

    public static void doSomethink(List<Animals> listAnimals, int eatValue){
        for (Animals animal:listAnimals) {
            animal.eat(eatValue);
            animal.voice();
        }
    }
}
