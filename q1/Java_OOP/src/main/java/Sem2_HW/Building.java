package Sem2_HW;

public class Building implements Health{

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья
    public Building(int maxHealthPoint) {
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

//    public void colour(){
//        if(currentHealthPoint == maxHealthPoint){
//            System.out.print(" currentHealthPoint: " + Colour.ANSI_GREEN + currentHealthPoint + Colour.ANSI_RESET +
//                    ", maxHealthPoint: " + Colour.ANSI_GREEN + maxHealthPoint + Colour.ANSI_RESET);
//        }
//    }
}
