package Sem1.practic;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public abstract class Fruit {
    private Long id;
    protected int cost;
    protected String color;

//    public Fruit(Long id, int cost, String name) {
//        this.id = id;
//        this.cost = cost;
//        this.color = name;
//    }
//
//    public int getCost() {
//        return cost;
//    }
//    public void setCost(int cost) {
//        this.cost = cost;
//    }
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return cost == fruit.cost && Objects.equals(color, fruit.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(cost, color);
//    }
//
//    @Override
//    public String toString() {
//        return "Fruit{" +
//                ", cost=" + cost +
//                ", color='" + color + '\'' +
//                '}';
//    }


}
