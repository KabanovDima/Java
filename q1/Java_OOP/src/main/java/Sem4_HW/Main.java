package Sem4_HW;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1));
        orangeBox.addFruit(new Orange(3));
        System.out.println(orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(4));
        appleBox.addFruit(new Apple(3));
        System.out.println(appleBox.getWeight());

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.addFruit(new GoldenApple(5));
        goldenAppleBox.addFruit(new GoldenApple(5));
        System.out.println(goldenAppleBox.getWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.moveTo(orangeBox1);
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox.getWeight());
    }
}
