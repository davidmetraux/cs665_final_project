package cs665.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> finishedCourses = new ArrayList<>();
    private List<Course> currentCourses = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public void addCourse(Course course){
        this.currentCourses.add(course);
    }

    public void newSemester(){
        finishedCourses.addAll(this.currentCourses);
        this.currentCourses.clear();
    }

    public StudentCoursesMemento createMemento() {
        return new StudentCoursesMemento(new ArrayList<>(this.currentCourses), new ArrayList<>(this.finishedCourses));
    }

    public void restoreFromMemento(StudentCoursesMemento memento) {
        this.finishedCourses = memento.getFinishedCourses();
        this.currentCourses = memento.getCurrentCourses();
    }

    @Override
    public String toString() {
        return this.name+ "; Current Courses: "+this.currentCourses+"; Finished Courses: "+ this.finishedCourses;
    }
}
