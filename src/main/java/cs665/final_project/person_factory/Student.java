package cs665.final_project.person_factory;

import cs665.final_project.courses.CourseSemester;
import cs665.final_project.programs.Program;

import java.util.List;

public class Student implements Person{
    private String name;
    private String thesis;
    private Program program;
    private List<Integer> grades;

    private List<CourseSemester> courseSemesters;


    public Student(String name){
        this.name = name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double gpa(){
        double sum = 0;
        for (int grade: this.grades){
            sum+=grade;
        }
        return sum/ this.grades.size();
    }
}
