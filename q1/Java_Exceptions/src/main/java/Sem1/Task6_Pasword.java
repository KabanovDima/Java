package Sem1;

import java.util.Scanner;

public class Task6_Pasword {
//    1. Создайте boolean метод, который запросит у пользователя поля: login, password и confirm password
//    2. Логин должен содержать только символы: a, b, c, d, e, 0,1, _, если это не так нужно
//    бросить RuntimeException с соответствующим сообщением.
//    3. Логин должен быть не меньше 4 и не больше 8 символов, если это не так нужно бросить
//    RuntimeException с соответствующим сообщением.
//    4. Пароль должен быть не меньше 4 и не больше 8 символов и состоять только из цифр,
//    если это не так нужно бросить RuntimeException с соответствующим сообщением.
//    5. Пароль и его повтор должны совпадать, если это не так нужно бросить RuntimeException с
//    соответствующим сообщением.


    public static void main(String[] args) {
        registerUser();

    }

    public static boolean registerUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин (только a, b, c, d, e, 0,1, _): ");
        String login = scanner.nextLine();
        if(!login.matches("[abcde01_]{4,8}")){ //регулярное выражение
            throw new RuntimeException("Login must be contain simbols a, b, c, d, e, 0,1, _");
        }
        System.out.print("Введите пароль (только цифры): ");
        String password = scanner.nextLine();
        if(!password.matches("\\d{4,8}")){ //регулярное выражение
            throw new RuntimeException("Password must be contain just numbers");
        }
        System.out.print("Поворите пароль (только цифры): ");
        String confirmPassword = scanner.nextLine();
        if (!password.equals(confirmPassword)){
            throw new RuntimeException("Password is nor equals");
        }
        return true;
    }
}
