package Lect2;

import java.io.File;

public class Main {
    public static void main(String[] args) {

    }

    static void createString(){
        var s = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        System.out.println(System.currentTimeMillis() - s);
    }
    static void createStringSb(){
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
    }
    static void joinString(){
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
    }

    static void newFile(){
        File f1 = new File("file.txt");
    }
    static void findFilePath(){
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath()); //C:\Users\Dmitry\Desktop\GbDeveloper\GbDeveloper\q1\Java\file.txt
    }

    static void tryCatch(){
        try {
            String pathProject = System.getProperty("user.dir"); // Путь к текущей папки из которой запускается проект
            String pathFile = pathProject.concat("/file.txt"); // указываем конкретный файл
            File f3 = new File(pathFile); // создать новый файл и связать фаловую перемнную f3 по текущему пути  pathFile
            f3.createNewFile(); // создаем новый файл
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }
    }
    static void tryCatch1(){
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            }else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
