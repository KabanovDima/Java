package Sem6_HW_LapTop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например,
//        спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те
//        ноутбуки, что соответствуют условию
        LapTop lapTop1 = new LapTop("dell", "windows", 17, 256);
        LapTop lapTop2 = new LapTop("dell", "linux", 16, 1024);
        LapTop lapTop3 = new LapTop("lenovo", "windows", 21, 528);
        LapTop lapTop4 = new LapTop("xiaomi", "windows", 22, 528);
        LapTop lapTop5 = new LapTop("xiaomi", "windows", 22, 528);
        LapTop lapTop6 = new LapTop("msi", "null", 19, 756);

        List<LapTop> lapTopList = new ArrayList(Arrays.asList(lapTop1,lapTop2,lapTop3,lapTop4,lapTop5,lapTop6));
        System.out.println(lapTopList);
        System.out.println(lapTopList.get(0));
        System.out.println(lapTopList.get(2));

        Scanner scaner = new Scanner(System.in);
        System.out.print("Выберите параметр сортировки: \n" +
                "- 1 - бренд,\n" +
                "- 2 - операционная система, \n" +
                "- 3 - размер монитора, \n" +
                "- 4 - размер операвной памяти\n" +
                "и введите цифру: ");
        String comand = scaner.nextLine();

        if(comand.equals("1")){
            System.out.print("Введите бренд: ");
            String comandBrand = scaner.nextLine();
            for (int i = 0; i < lapTopList.size(); i++) {
                if(lapTopList.get(i).getBrand().equals(comandBrand)){
                    System.out.print(lapTopList.get(i));
                }
            }
        }
        if(comand.equals("2")){
            System.out.print("Введите операционную систему: ");
            String comandSystem = scaner.nextLine();
            for (int i = 0; i < lapTopList.size(); i++) {
                if(lapTopList.get(i).getOperationalSysytem().equals(comandSystem)){
                    System.out.print(lapTopList.get(i));
                }
            }
        }
        if(comand.equals("3")){
            System.out.print("Введите размер монитора: ");
            Integer monSize = scaner.nextInt();
            for (int i = 0; i < lapTopList.size(); i++) {
                if(lapTopList.get(i).getMonitorSize() == monSize){
                    System.out.print(lapTopList.get(i));
                }
            }
        }
        if(comand.equals("4")){
            System.out.print("Введите размер оперативной памяти: ");
            Integer ramSize = scaner.nextInt();
            for (int i = 0; i < lapTopList.size(); i++) {
                if(lapTopList.get(i).getRam() == ramSize){
                    System.out.print(lapTopList.get(i));
                }
            }
        } else{
            System.out.println("Вы выввели несуществующий параметр.");
        }



    }

}
