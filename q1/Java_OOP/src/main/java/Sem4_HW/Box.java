package Sem4_HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box <T extends Fruit> {

    private final List<T> listFruits;

    public Box() {
        this.listFruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        listFruits.add(fruit);
    }

    public int getWeight(){
        int sum = 0;
        for (Fruit fruit: listFruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void moveTo(Box<T> box){
        box.listFruits.addAll(this.listFruits);
        this.listFruits.clear();

    }
}
