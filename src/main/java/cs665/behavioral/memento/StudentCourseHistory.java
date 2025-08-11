package cs665.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseHistory {
    private List<StudentCoursesMemento> mementos = new ArrayList<>();;


    public void addMemento(StudentCoursesMemento momento) {
        this.mementos.add(momento);
    }

    public StudentCoursesMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}
