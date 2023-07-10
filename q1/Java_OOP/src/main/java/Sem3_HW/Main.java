package Sem3_HW;

import Sem1.B;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container();
        container1.addBoxes(new Box(10));
        container1.addBoxes(new Box(30));
        container1.addBoxes(new Box(12));
        Container container2 = new Container();
        container2.addBoxes(new Box(20));
        container2.addBoxes(new Box(20));

        List<Box> boxes1 = container1.getBoxes();
        List<Box> boxes2 = container2.getBoxes();
        int boxes1Size = container1.getBoxes().size();
        System.out.println(boxes1Size);
        System.out.printf(boxes1 + "\n" + boxes2);
        System.out.println();
        System.out.println(container1.getWeight());
        System.out.println(container2.getWeight());
        System.out.println("Сравнение по весу (compareTo): " + container1.compareTo(container2));

        ContainerCountComparator comparator = new ContainerCountComparator();
        System.out.println("Сравнение по кол-ву коробок в контейнере (Comparator): " + comparator.compare(container1, container2));

        System.out.println("Итерация по контейнеру1:");
        for (Box i: container1) {
            System.out.println(i.getWeight());
        }


    }
}
