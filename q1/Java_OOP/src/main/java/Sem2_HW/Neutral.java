package Sem2_HW;

public class Neutral implements Health{
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Neutral(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public void getHealth() {
        System.out.printf("Current health: %s, max health: %s", currentHealthPoint, maxHealthPoint);
    }

    @Override
    public String toString() {
        return " currentHealthPoint: " + currentHealthPoint + ", maxHealthPoint: " +
                Colour.ANSI_GREEN + maxHealthPoint + Colour.ANSI_RESET;
    }
}
