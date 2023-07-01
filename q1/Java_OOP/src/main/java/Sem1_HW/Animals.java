package Sem1_HW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animals {
    private String name;
    private int age;

    public abstract void voice();
    public abstract void eat(int value);
    public abstract void run();




}
