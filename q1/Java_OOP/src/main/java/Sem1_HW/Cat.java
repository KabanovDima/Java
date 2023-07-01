package Sem1_HW;

public class Cat extends Animals{
    private String name;
    private int age;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void voice(){
        System.out.println(getName() + " say miay");
    }

    public void eat(int value) {
        System.out.println(getName() + " поел " + value + " еды");
    }

    public void run(){
        System.out.println(getName() + " is running");
    }
}
