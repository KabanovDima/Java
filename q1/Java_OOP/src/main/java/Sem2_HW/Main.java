package Sem2_HW;

import java.lang.reflect.InvocationTargetException;

public class Main {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Render render = new Render();
        Building building1 = new Building(100);
        building1.setCurrentHealthPoint(50);
        Building building2 = new Building(100);
        building2.setCurrentHealthPoint(40);
        Building building3 = new Building(100);
        building3.setCurrentHealthPoint(100);
        Hero hero1 = new Hero(100, 80);
        hero1.setCurrentHealthPoint(60);
        hero1.setCurrentManaPoint(40);
        Neutral neutral1 = new Neutral(120);
        neutral1.setCurrentHealthPoint(20);

        render.showIndicator(building1);
        render.showIndicator(building2);
        render.showIndicator(building3);
        render.showIndicator(hero1);
        render.showIndicator(neutral1);
    }
}
