package Sem2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    private static int i = 0;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, "+
                "в который хотите записать значение 1");
        try{
            if(scanner.hasNextInt()) {
                int index = scanner.nextInt();
                arr[index] = 1;
                System.out.println(Arrays.toString(arr));
//                test();
            }else {
                System.out.println("Введено не число");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Указан индекс за пределами массива");
        } finally {
            System.out.println("Finally выолнится в любом случае");
        }
    }

    private static void test(){
        while (true){
            i+=1_000_000_000;
            test();
        }

    }

}
