package Sem3_HW;

public class Box{
    private int weight;

    public Box(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box(" +
                "weight=" + weight +
                ')';
    }

}


