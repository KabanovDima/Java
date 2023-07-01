package Sem1;

import java.util.ArrayList;

public class OurList<T> extends ArrayList<T> {
    @Override
    public String toString() {
        return "Наш новый ту стринг!: " + super.toString();
    }
}
