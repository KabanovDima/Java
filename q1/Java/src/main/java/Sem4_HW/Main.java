package Sem4_HW;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
//
//                > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//                > java
//                > python
//                > c#
//                > print
//                < [c#, python, java]
//                > revert
//                > print
//                < [python, java]
//                > revert
//                > revert
//                > print
//                < []
//> revert -> throw new NoSuchElementException

        LinkedList<String> storage = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для вывода списка команд введите help");
        while(true){
            System.out.print("Введите строку или команду: ");
            String enteredString = scanner.nextLine();
            if("help".equals(enteredString)){
                System.out.println("1. print - выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.\n" +
                        "2. revert - удаляет предыдущую введенную строку из памяти.\n" +
                        "3. exit - программа завершается.");
                System.out.println();
                continue;
            }
            if("exit".equals(enteredString)){
                break;
            }
            /*if("revert".equals(enteredString)){
                if(storage.getFirst() != null){
                    storage.remove();
                    continue;
                }
            }*/

            if("revert".equals(enteredString)){
                try{storage.remove();
                    continue;
                }catch(NoSuchElementException e){
                    System.err.println("Список пуст");
                    continue;
                }
            }

            if("print".equals(enteredString)){
                System.out.println(storage);
                continue;
            }

            storage.addFirst(enteredString);
        }
        System.out.println("Программа завершена");
    }
}
