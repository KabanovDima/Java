package Sem4;

import Sem4.controllers.StudentController;
import Sem4.repositories.StudentRepository;
import Sem4.services.StudentService;
import Sem4.view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentController();
//        -----------------------------------------------------------

        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");

        view.sendOnConsole();
        view.sendOnConsole("NAME");
        view.sendOnConsole("AGE");
        view.removeUser("Ivan Morozov");
        view.sendOnConsole();
    }

    private static StudentView getStudentController(){
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }
}
