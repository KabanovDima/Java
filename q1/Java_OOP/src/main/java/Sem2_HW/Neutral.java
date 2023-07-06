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
    public String getHealth() {
        return healthColour();
    }

    @Override
    public String healthColour() {
        if(currentHealthPoint == maxHealthPoint){
            return String.format("Current health: %sMax health: %s", Colour.ANSI_GREEN +  currentHealthPoint + Colour.ANSI_RESET + "\n",
                    Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET);
        }
        if(currentHealthPoint >= maxHealthPoint/2){
            return String.format("Current health: %sMax health: %s", Colour.ANSI_YELLOW +  currentHealthPoint + Colour.ANSI_RESET + "\n",
                    Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET);
        }
        return String.format("Current health: %sMax health: %s", Colour.ANSI_RED +  currentHealthPoint + Colour.ANSI_RESET + "\n",
                Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET);
    }

}
