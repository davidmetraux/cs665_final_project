package cs665.final_project.programs;

import cs665.final_project.courses.CourseSemester;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    private int year;
    private int semester;
    private List<CourseSemester> coursesThisSemester = new ArrayList<CourseSemester>();


    public Semester(int year, int semester){
        this.year = year;
        this.semester = semester;
    }

    public void addCourseSemester(CourseSemester courseSemester){
        this.coursesThisSemester.add(courseSemester);
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }
}
