//package Sem2_HW_1;
//
//public class Hero implements Health, Mana {
//
//    private int maxHealthPoint; // максимально количество здоровья
//    private int currentHealthPoint; // текущее количество здоровья
//    private int maxManaPoint; // максимально количество магический энергии
//    private int currentManaPoint; // текущее количество магический энергии
//    public Hero(int maxHealthPoint, int maxManaPoint) {
//        this.maxHealthPoint = maxHealthPoint;
//        this.maxManaPoint = maxManaPoint;
//
//        this.currentHealthPoint = maxHealthPoint;
//        this.currentManaPoint = maxManaPoint;
//    }
//    public void setCurrentHealthPoint(int currentHealthPoint) {
//        this.currentHealthPoint = currentHealthPoint;
//    }
//    public void setCurrentManaPoint(int currentManaPoint) {
//        this.currentManaPoint = currentManaPoint;
//    }
//
//    @Override
//    public String getHealth() {
//        return healthColour();
//    }
//
//    @Override
//    public String getMana() {
//        return manaColour();
//    }
//
//    @Override
//    public String healthColour() {
//        if(currentHealthPoint == maxHealthPoint){
//            return String.format("Current health: %sMax health: %s", Colour.ANSI_GREEN +  currentHealthPoint + Colour.ANSI_RESET + "\n",
//                    Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET);
//        }
//        if(currentHealthPoint >= maxHealthPoint/2){
//            return String.format("Current health: %sMax health: %s", Colour.ANSI_YELLOW +  currentHealthPoint + Colour.ANSI_RESET + "\n",
//                    Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET);
//        }
//        return String.format("Current health: %sMax health: %s", Colour.ANSI_RED +  currentHealthPoint + Colour.ANSI_RESET + "\n",
//                Colour.ANSI_GREEN +  maxHealthPoint + Colour.ANSI_RESET);
//    }
//
//    @Override
//    public String manaColour() {
//        if(currentManaPoint == maxManaPoint){
//            return String.format("Current mana: %sMax mana: %s", Colour.ANSI_GREEN +  currentManaPoint + Colour.ANSI_RESET + "\n",
//                    Colour.ANSI_GREEN +  maxManaPoint + Colour.ANSI_RESET);
//        }
//        if(currentManaPoint >= maxManaPoint/2){
//            return String.format("Current mana: %sMax mana: %s", Colour.ANSI_YELLOW +  currentManaPoint + Colour.ANSI_RESET + "\n",
//                    Colour.ANSI_GREEN +  maxManaPoint + Colour.ANSI_RESET);
//        }
//        return String.format("Current mana: %sMax mana: %s", Colour.ANSI_RED +  currentManaPoint + Colour.ANSI_RESET + "\n",
//                Colour.ANSI_GREEN +  maxManaPoint + Colour.ANSI_RESET);
//    }
//
//
//
//}
