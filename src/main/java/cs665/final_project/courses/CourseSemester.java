package cs665.final_project.courses;

import cs665.final_project.person_factory.Student;
import cs665.final_project.programs.Semester;

import java.util.List;

public class CourseSemester {
    private Course course;
    private List<Student> enrolled;
    private List<Student> waitlisted;
    private Semester semester;

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEnrolled(List<Student> enrolled) {
        this.enrolled = enrolled;
    }

    public void setWaitlisted(List<Student> waitlisted) {
        this.waitlisted = waitlisted;
    }
}
