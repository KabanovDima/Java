package Sem2_HW;

public class Main {


    public static void main(String[] args) {

        Render render = new Render();
        Building building1 = new Building(100);
        building1.setCurrentHealthPoint(50);
        Building building2 = new Building(100);
        building2.setCurrentHealthPoint(40);
        Hero hero1 = new Hero(100, 80);
        hero1.setCurrentHealthPoint(60);
        hero1.setCurrentManaPoint(40);
        Neutral neutral1 = new Neutral(120);
        neutral1.setCurrentHealthPoint(20);

        render.showIndicator(building1);
        render.showIndicator(building2);
        render.showIndicator(hero1);
        render.showIndicator(neutral1);
    }
}
