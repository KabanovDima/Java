package Sem3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();
        group.addStudents(new Student(4L, "Ivan Morozov"));
        group.addStudents(new Student(6L, "Petr Vorobev"));
        group.addStudents(new Student(2L, "Sidor Sidorov"));
        group.addStudents(new Student(1L, "Elena Ivanova"));
        group.addStudents(new Student(8L, "Anna Morozova"));

        var students = group.getStudents();

        Collections.sort(students);
        System.out.println(students);

//        Collections.sort(students, new StudentComparator());
//        или
//        students.sort(new StudentComparator());
        students.sort(Comparator.reverseOrder());
        System.out.println(students);

//        for (Student student:group) {
//            System.out.println(group);
//        }

        Iterator<Student> iterator = group.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.printf("%s\t%s%n", student.getId(), student.getName());
            if(student.getName().equals("Petr Vorobev")){
                iterator.remove();
            }
        }
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
