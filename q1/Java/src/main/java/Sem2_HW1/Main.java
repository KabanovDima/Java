package Sem2_HW1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        task2();
    }
    //    1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//    используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//    Если значение null, то параметр не должен попадать в запрос.
//    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

    static void task1(){
        String jSonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    }

//    2) Реализуйте алгоритм сортировки пузырьком числового массива,
//    результат после каждой итерации запишите в лог-файл.

    static void task2() throws IOException {
        int[] arr = new int[] {3, 2, 7, 4, 5};
        Logger logger = Logger.getLogger(Sem2_HW.Main.class.getName());
        FileHandler fh = new FileHandler("logSem2HW.txt"); // создем обработчик для записи логов в файл
        SimpleFormatter sFormat = new SimpleFormatter(); // создаем форматировщик для указания стиля записи логов
        logger.addHandler(fh); // добавляем обработчик к логеру
        fh.setFormatter(sFormat); // применяем форматировщик к обработчику

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            String arrToString = Arrays.toString(arr);
            logger.log(Level.INFO, "result: " + arrToString);
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

}
