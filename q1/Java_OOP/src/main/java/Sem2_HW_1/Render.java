package Sem2_HW_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Render{
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {
        if(object instanceof Health){
            System.out.println(healthColour(object)
//                    "Max health: " + Colour.ANSI_GREEN + ((Health) object).maxHealthPoint() + Colour.ANSI_RESET + ", " +
//                    "Current health: " + ((Health) object).currentHealthPoint()
            );
        }
    }

    public String healthColour(Object object) {
        if(((Health) object).currentHealthPoint() == ((Health) object).maxHealthPoint()){
            return String.format("Current health: %sMax health: %s", Colour.ANSI_GREEN +  ((Health) object).currentHealthPoint() + Colour.ANSI_RESET + "\n",
                    Colour.ANSI_GREEN +  ((Health) object).maxHealthPoint() + Colour.ANSI_RESET);
        }
        if(((Health) object).currentHealthPoint() >= ((Health) object).maxHealthPoint()/2){
            return String.format("Current health: %sMax health: %s", Colour.ANSI_YELLOW +  ((Health) object).currentHealthPoint() + Colour.ANSI_RESET + "\n",
                    Colour.ANSI_GREEN +  ((Health) object).maxHealthPoint() + Colour.ANSI_RESET);
        }
        return String.format("Current health: %sMax health: %s", Sem2_HW.Colour.ANSI_RED +  ((Health) object).currentHealthPoint() + Sem2_HW.Colour.ANSI_RESET + "\n",
                Colour.ANSI_GREEN +  ((Health) object).maxHealthPoint() + Colour.ANSI_RESET);
    }

}
