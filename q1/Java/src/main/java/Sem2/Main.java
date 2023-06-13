package Sem2;

public class Main {
    public static void main(String[] args) {
//    task1();
//    task2();
    }


    /*Задание 1. Дано четное число N (>0) и символы c1 и c2.
    Написать метод, который вернет строку длины N, которая состоит из
    чередующихся символов с1 и с2, начиная с с1.*/

    static void task1(){
        int n = 4;
        String c1 = "A";
        String c2 = "B";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.print(sb);
    }

//    Задание 2. Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

    static void task2(){
        String data = "aaaabbbcddc";
        StringBuilder newData = new StringBuilder();
        int count = 1;

        for (int i = 1; i < data.length(); i++) {
            if(data.charAt(i -1) == data.charAt(i)){
                count++;
            }else {
                newData.append(data.charAt(i-1));
                if(count > 1) {
                    newData.append((count));
                }
                count = 1;
            }
            if(i == data.length()-1){
                newData.append(data.charAt(i));
                if(count > 1){
                    newData.append(count);
                }
            }
        }
        System.out.print(newData);
    }
}
