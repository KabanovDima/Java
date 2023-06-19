package Sem4_LinkedList;

import javax.security.sasl.SaslClient;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex_0 {
    public static void main(String[] args) {
        //        Задача.
//        Реализовать консольное приложение, которое:
//        1. Принимает от пользователя строку вида text~num
//        2. Нужно распарсить строку по ~, сохранить текст в связный списоу на озицию num
//        3. Если введено print-num, выводит строку из позиции num в связном списке и удаляет ее из списка.
//        4. Если введено exit, то завершаем программу.

        LinkedList<String> storage = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String command = scanner.nextLine();
            if("exit".equals(command)){
                break;
            }
            String[] arguments = command.split("~");
            if(arguments.length != 2){
                System.out.println("Некорректный ввод");
                continue;
            }

            String text = arguments[0];
            int num = -1;
            try {
                num = Integer.parseInt(arguments[1]);
            }catch (NumberFormatException e){
                System.out.println("Некорректный ввод");
                continue;
            }
            if("print".equals(text)){
                if(num < 0 || num >= storage.size()){
                    System.out.println("Некорректный индекс");
                    continue;
                }
                String element = storage.remove(num);
                if(element != null){
                    System.out.println(element);
                }else{
                    System.out.println("Некорректный индекс");
                    continue;
                }

            }else{
                while(storage.size() < num){
                    storage.add((null));
                }
                storage.add(num, text);
            }


        }
        System.out.println("Программа завершена");
    }
}
