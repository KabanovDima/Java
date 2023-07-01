package Sem1;

public abstract class A {
    protected int a;
    private int b;
    private int c;
    private static int count;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
//        System.out.println("Конструктор А");
        System.out.printf("a: %s, b: %s, c: %s\n", a, b, c);
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public static int getCount() {
        return count;
    }

    public void sing(){
        System.out.println("LA LAAAAAALAAA");
    }

    public abstract void run();

}
