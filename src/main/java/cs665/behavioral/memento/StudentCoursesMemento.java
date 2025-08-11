package cs665.behavioral.memento;


import java.util.List;

public class StudentCoursesMemento {
    private List<Course> currentCourses;
    private List<Course> finishedCourses;

    public StudentCoursesMemento(List<Course> currentCourses, List<Course> finishedCourses) {
        this.currentCourses = currentCourses;
        this.finishedCourses = finishedCourses;
    }

    public List<Course> getCurrentCourses() {
        return this.currentCourses;
    }

    public List<Course> getFinishedCourses() {
        return this.finishedCourses;
    }
}
