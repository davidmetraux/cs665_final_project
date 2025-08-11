package cs665.behavioral.momento;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseHistory {
    private List<StudentCoursesMomento> mementos = new ArrayList<>();;


    public void addMemento(StudentCoursesMomento memento) {
        this.mementos.add(memento);
    }

    public StudentCoursesMomento getMemento(int index) {
        return this.mementos.get(index);
    }
}
