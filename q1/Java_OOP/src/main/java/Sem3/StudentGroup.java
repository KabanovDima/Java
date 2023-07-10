package Sem3;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private final List<Student> students;

    public StudentGroup() {
        students = new ArrayList<>();
    }

    public void addStudents (Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }
}
