package Sem2_HW;

public class Hero implements Health, Mana{

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public void getHealth() {
        System.out.printf("Current health: %s, max health: %s",currentHealthPoint, maxHealthPoint);
    }

    @Override
    public void getMana() {
        System.out.printf("Current mana: %s, max mana: %s", currentManaPoint, maxManaPoint);
    }

    @Override
    public String toString() {
        return " currentHealthPoint: " + currentHealthPoint + ", maxHealthPoint: " + Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET + "\n" +
                " currentManaPoint: " + currentManaPoint + ", maxManaPoint: " + Colour.ANSI_GREEN + maxManaPoint + Colour.ANSI_RESET;
    }
    // FIXME: 29.06.2023 Дописать нужное
}
