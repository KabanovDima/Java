package Sem2_HW;

//Разработайте программу, которая выбросит Exception, когда пользователь
//вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введена строка: " + emptyString());
    }

    private static String emptyString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        if(string == null || string.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя.");
        }
        return string;
    }

}
