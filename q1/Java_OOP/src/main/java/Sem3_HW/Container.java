package Sem3_HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Container implements Comparable<Container>, Iterable<Box>{
    private final List<Box> boxes;


    public Container(){
        this.boxes = new ArrayList<>();
    }

    public void addBoxes (Box box){
        boxes.add(box);
    }
    public List<Box> getBoxes(){
        return boxes;
    }

    public int getWeight(){
        int sum = 0;
        for (Box i: boxes) {
            sum += i.getWeight();
        }
        return sum;
    }


    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }


    @Override
    public int compareTo(Container o) {
        return Integer.compare(this.getWeight(), o.getWeight());
    }
}
