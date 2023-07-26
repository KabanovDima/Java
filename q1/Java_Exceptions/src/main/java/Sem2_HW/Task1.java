package Sem2_HW;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//возвращает введенное значение. Ввод текста вместо числа не должно приводить к
//падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введенное число: " + task1());
    }


    private static float task1(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        float val = 0;
        while (flag){
            System.out.print("Введите дробное число (разделитель через .): ");
            try {
                val = Float.parseFloat(scanner.next());
                flag = false;
            } catch (Exception e) {
                System.out.println("Вы ввели не корректное значение, попробуйте снова.");
            }
        }
        return val;
    }
}
