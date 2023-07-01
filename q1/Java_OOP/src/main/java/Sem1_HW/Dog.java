package Sem1_HW;

public class Dog extends Animals{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " say gav");
    }

    @Override
    public void eat(int value) {
        System.out.println(getName() + " eat " + value + " food ");
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running ");
    }
}
