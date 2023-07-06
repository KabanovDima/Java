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
    public void getHealth() {
          System.out.printf("Current health: %s, max health: %s", currentHealthPoint, maxHealthPoint);

    }

    @Override
    public String toString() {
      return " currentHealthPoint: " + currentHealthPoint +
              ", maxHealthPoint: "+ Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET;
    }

//    public void colour(){
//        if(currentHealthPoint == maxHealthPoint){
//            System.out.print(" currentHealthPoint: " + Colour.ANSI_GREEN + currentHealthPoint + Colour.ANSI_RESET +
//                    ", maxHealthPoint: " + Colour.ANSI_GREEN + maxHealthPoint + Colour.ANSI_RESET);
//        }
//    }
}
