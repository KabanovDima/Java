package Sem5_HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Реализовать консольное приложение - телефонный справочник.
//        У одной фамилии может быть несколько номеров.
//        Пользователь может вводить команды:
//        1: ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
//        2: GET Ivanov - получить список всех номеров по фамилии
//        3: REMOVE Ivanov - удалить все номера по фамилии
//        4: LIST - Посмотреть все записи
//        5: EXIT - Завершить программу
//        Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
//
//        Пример взаимодействия (=> - это вывод на консоль):
//        ADD Ivanov 8 800 555 35 35
//        ADD Ivanov 8 800 100 10 10
//        GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
//        ADD Petrov 8 555 12 34
//        LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
//        REMOVE Ivanov
//        LIST => Petrov = [8 555 12 34]
//        GET NoName => Не найдена запись с фамилией "NoName"
//        REMOVE NoName => Не найдена запись с фамилией "NoName"3

        hw();
    }


    static void hw(){
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> catalog = new HashMap<>();
        while (true) {
            String command = scanner.nextLine().toUpperCase();
            if (command.equals("EXIT") || command.equals("LIST") || command.equals("ADD") || command.equals("GET") ||
                    command.equals("REMOVE")) {
                if ("EXIT".equals(command)) {
                    break;
                }
                if ("LIST".equals(command)) {
                    for (String key : catalog.keySet()) {
                        System.out.printf("%s\t=\t%s, ", key, catalog.get(key));
                    }
                }
                if ("ADD".equals(command)) {
                    String name = scanner.nextLine();
                    if (catalog.containsKey(name)) {
                        ArrayList<String> values = catalog.get(name);
                        values.add(scanner.nextLine());
                        catalog.put(name, values);
                    } else {
                        ArrayList<String> values = new ArrayList<>();
                        values.add(scanner.nextLine());
                        catalog.put(name, values);
                    }
                    continue;
                }
                if ("GET".equals(command)) {
                    String getCommand = scanner.nextLine();
                    if (catalog.containsKey(getCommand)) {
                        System.out.println(catalog.get(getCommand));
                    } else {
                        System.out.println("Такого ключа нет");
                    }
                }
                if ("REMOVE".equals(command)) {
                    String removeCommand = scanner.nextLine();
                    if (catalog.containsKey(removeCommand)) {
                        catalog.remove(removeCommand);
                    } else {
                        System.out.println("Такого ключа нет");
                    }
                }
            }else{
                System.out.println("Такой команды нет, попробуйте еще раз");
            }
        }
        System.out.println("Программа завершена.");
    }

}
