package Sem4.view;

import Sem4.controllers.UserController;
import Sem4.models.Student;
import com.sun.source.tree.LiteralTree;

import java.util.List;
import java.util.function.Consumer;

public class StudentView implements UserView{
    private final UserController<Student> controller;

    public StudentView(UserController<Student> controller) {
        this.controller = controller;
    }

    public void sendOnConsole(){
        sendOnConsole("NONE");
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = controller.getAll();
        if(sortType.equals("NONE")){
            controller.getAll();
        }
        if(sortType.equals("NAME")){
            controller.getAllSortByFullName();
        }
        if(sortType.equals("ID")){
            controller.getAllSortById();
        }
//        switch (sortType) {
//            case "NONE" -> controller.getAll();
//            case "NAME" -> controller.getAllSortByFullName();
//            case "ID" -> controller.getAllSortById();
//        };

        if(students == null || students.size() == 0){
            System.out.println("Отсутствуют студенты для вывода");
            return;
        }
        System.out.println("=========================================================");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        students.forEach((student)-> System.out.println(student));
        students.forEach (System.out::println);
        System.out.println("=========================================================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        int removeCount = controller.remove(fullName);

        if(removeCount == 0){
            System.out.println("Удалеие не получилось.");
        }else{
            System.out.println("Удалено студентов: " + removeCount);
        }
    }
}
