package cs665.behavioral.momento;


import java.util.List;

public class StudentCoursesMomento {
    private List<Course> currentCourses;
    private List<Course> finishedCourses;

    public StudentCoursesMomento(List<Course> currentCourses, List<Course> finishedCourses) {
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
