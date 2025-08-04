package cs665.final_project.courses;

import cs665.final_project.person_factory.Faculty;
import cs665.final_project.person_factory.Student;
import cs665.final_project.programs.Semester;

public class Thesis {
    private Student student;
    private Faculty advisor;
    private String thesisName;
    private Semester semester;

    public void setAdvisor(Faculty advisor) {
        this.advisor = advisor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Faculty getAdvisor() {
        return advisor;
    }

    public String getThesisName() {
        return thesisName;
    }

    public Student getStudent() {
        return student;
    }

    public Semester getSemester() {
        return semester;
    }
}
