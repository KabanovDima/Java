package Sem3_HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private static boolean isCorrect = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Введите ФИО, ДР, телефон, пол (разделитель - пробел): ");
            input = scanner.nextLine();
            String[] data = input.split(" ");

           checkLenght(data);

            String surname = data[0];
            String name = data[1];
            String secondName = data[2];
            String birthday = data[3];
            String phone = data[4];
            String gender = data[5];

            try {
                if (!surname.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("В фамилии введены не только буквы");
                }
            } catch (IllegalArgumentException e) {
                isCorrect = false;
                System.err.println(e.getMessage());
            }
            try {
                if (!name.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("В имени введены не только буквы");
                }
            } catch (IllegalArgumentException e) {
                isCorrect = false;
                System.err.println(e.getMessage());
            }
            try {
                if (!secondName.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("В отчестве введены не только буквы");
                }
            } catch (IllegalArgumentException e) {
                isCorrect = false;
                System.err.println(e.getMessage());
            }

            checkDate(birthday);
            checkPhone(phone);
            checkGender(gender);

            if(isCorrect) {
                String fileName = surname + ".txt";
                File file = new File(fileName);
                if (file.exists()) {
                    try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                        fileWriter.write("<" + surname + "><" + name + "><" + secondName + "><" + birthday + "><" + phone + "><" + gender + ">" + "\n");
                        System.out.println("Данные успешно записаны в файл " + fileName);
                    } catch (IOException e) {
                        System.err.println("Ошибка при записи в файл" + e.getMessage());
                        e.printStackTrace();
                    }
                } else {
                    try (FileWriter fileWriter = new FileWriter(fileName)) {
                        fileWriter.write("<" + surname + "><" + name + "><" + secondName + "><" + birthday + "><" + phone + "><" + gender + ">" + "\n");
                        System.out.println("Файл " + fileName + " успешно создан и данные успешно записаны в файл");
                    } catch (IOException e) {
                        System.err.println("Ошибка при создании и записи в файл" + e.getMessage());
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Хотите ввести еще данные? yes/no");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("yes"));

        System.out.println("Программа завершена");

    }

    private static void checkLenght(String[] arr){
        if (arr.length > 6) {
            isCorrect = false;
            throw new RuntimeException("Вы ввели больше значений");
        } else if (arr.length < 6) {
            isCorrect = false;
            throw new RuntimeException("Вы ввели меньше значений");
        }
    }
    private static void checkDate(String str){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(str);
        } catch (ParseException e) {
            isCorrect = false;
            System.err.println("Введен неверный формат даты рождения. Нужно ввести в формате dd.mm.yyyy");
            e.printStackTrace();
        }
    }
    private static void checkPhone(String phone){
        try {
            Integer.parseInt(phone);
        }catch (NumberFormatException e){
            isCorrect = false;
            System.err.println("Номер телефона должен содержать только цифры");
            e.printStackTrace();
//
        }
    }
    private static void checkGender(String gender){
        if(!gender.equals("m") && !gender.equals("f")){
            isCorrect = false;
            System.err.println("Вы указали неверный формат пола. Требуется указать 'm' или 'f'");
        }
    }

}
